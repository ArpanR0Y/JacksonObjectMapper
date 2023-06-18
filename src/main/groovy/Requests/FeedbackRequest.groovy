package Requests

import Model.FeedbackHeader
import Model.FeedbackPayload

class FeedbackRequest {

    FeedbackHeader feedbackHeader
    FeedbackPayload feedbackPayload

    FeedbackRequest() {
    }

    FeedbackRequest(FeedbackHeader feedbackHeader, FeedbackPayload feedbackPayload) {
        this.feedbackHeader = feedbackHeader
        this.feedbackPayload = feedbackPayload
    }

    FeedbackHeader getFeedbackHeader() {
        return feedbackHeader
    }

    void setFeedbackHeader(FeedbackHeader feedbackHeader) {
        this.feedbackHeader = feedbackHeader
    }

    FeedbackPayload getFeedbackPayload() {
        return feedbackPayload
    }

    void setFeedbackPayload(FeedbackPayload feedbackPayload) {
        this.feedbackPayload = feedbackPayload
    }

    @Override
    public String toString() {
        return "FeedbackRequest{" +
                "feedbackHeader=" + feedbackHeader +
                ", feedbackPayload=" + feedbackPayload +
                '}';
    }
}
