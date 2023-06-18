import Model.FeedbackHeader
import Model.FeedbackPayload
import Requests.FeedbackRequest
import com.fasterxml.jackson.databind.ObjectMapper

class Mapper {
    static void main(String[] args) throws InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper()

        Thread serializationThread = new Thread(() -> {
            try {
                // OBJECT --> JSON
                FeedbackRequest request = new FeedbackRequest(
                        new FeedbackHeader("https://api.example.com/endpoint",
                                "application/json",
                                "HMAC-SHA256",
                                "your_api_key_here",
                                "your_signature_here"),
                        new FeedbackPayload("John Doe",
                                "johndoe@example.com",
                                30,
                                "123 Main Street",
                                "New York",
                                "United States"))

                // Serialized
                objectMapper.writeValue(new File("src/main/resources/feedbackRequest.json"), request)
                println("Request Object Serialized")
            } catch (Exception e) {
                e.printStackTrace()
            }
        })

        Thread deserializationThread = new Thread(() -> {
            try {
                // Wait for serialization to complete before executing the deserialization process
                serializationThread.join()
                try {
                    // JSON --> OBJECT
                    FeedbackRequest feedbackRequest = objectMapper.readValue(new File("src/main/resources/feedbackRequest.json"), FeedbackRequest.class)
                    println(feedbackRequest)
                } catch (Exception e) {
                    e.printStackTrace()
                }
                println("Request Object De-Serialized")
            } catch (InterruptedException e) {
                e.printStackTrace()
            }
        })

        // Start both threads
        serializationThread.start()
        deserializationThread.start()

        // Wait for both threads to complete
        serializationThread.join()
        deserializationThread.join()

        println("Request Serialization/De-Serialization completed!!")
    }
}