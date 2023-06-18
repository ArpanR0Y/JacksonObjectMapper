package Requests

class FeedbackRequest {

    String feedbackHeader
    String feedbackRequest

    FeedbackRequest(String feedbackHeader, String feedbackRequest) {
        this.feedbackHeader = feedbackHeader
        this.feedbackRequest = feedbackRequest
    }

    String getFeedbackHeader() {
        return feedbackHeader
    }

    void setFeedbackHeader(String feedbackHeader) {
        this.feedbackHeader = feedbackHeader
    }

    String getFeedbackRequest() {
        return feedbackRequest
    }

    void setFeedbackRequest(String feedbackRequest) {
        this.feedbackRequest = feedbackRequest
    }
}
