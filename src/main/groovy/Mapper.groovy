import Model.Person
import Requests.Request
import com.fasterxml.jackson.databind.ObjectMapper

class Mapper {
    static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper()

        try {
//            //OBJECT --> JSON
//            Person person = new Person("Jhon Doe",
//                    "johndoe@example.com",
//                    30,
//                    "123 Main Street",
//                    "New York",
//                    "United States")
//
//            objectMapper.writeValue(new File("src/main/resources/person.json"), person)

            //JSON --> OBJECT
            InputStream requestStream = Mapper.class.getClassLoader().getResourceAsStream("request.json")
//            String requestString = "{\n" +
//                    "  \"header\": {\n" +
//                    "    \"url\": \"https://api.example.com/endpoint\",\n" +
//                    "    \"contentType\": \"application/json\",\n" +
//                    "    \"authorization\": \"HMAC-SHA256\",\n" +
//                    "    \"apiKey\": \"your_api_key_here\",\n" +
//                    "    \"apiSignature\": \"your_signature_here\"\n" +
//                    "  },\n" +
//                    "  \"payload\": {\n" +
//                    "    \"name\": \"John Doe\",\n" +
//                    "    \"email\": \"johndoe@example.com\",\n" +
//                    "    \"age\": 30,\n" +
//                    "    \"address\": \"123 Main Street\",\n" +
//                    "    \"city\": \"New York\",\n" +
//                    "    \"country\": \"United States\"\n" +
//                    "  }\n" +
//                    "}\n"

            Request request = objectMapper.readValue(requestStream, Request)

            println(request)
        } catch (Exception e) {
            e.printStackTrace()
        }
    }
}
