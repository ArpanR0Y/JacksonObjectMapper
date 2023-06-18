package Model

class Header {
    private String url;
    private String contentType;
    private String authorization;
    private String apiKey;
    private String apiSignature;

    Header() {
    }

    Header(String url, String contentType, String authorization, String apiKey, String apiSignature) {
        this.url = url
        this.contentType = contentType
        this.authorization = authorization
        this.apiKey = apiKey
        this.apiSignature = apiSignature
    }

    String getUrl() {
        return url
    }

    void setUrl(String url) {
        this.url = url
    }

    String getContentType() {
        return contentType
    }

    void setContentType(String contentType) {
        this.contentType = contentType
    }

    String getAuthorization() {
        return authorization
    }

    void setAuthorization(String authorization) {
        this.authorization = authorization
    }

    String getApiKey() {
        return apiKey
    }

    void setApiKey(String apiKey) {
        this.apiKey = apiKey
    }

    String getApiSignature() {
        return apiSignature
    }

    void setApiSignature(String apiSignature) {
        this.apiSignature = apiSignature
    }

    @Override
    public String toString() {
        return "Header{" +
                "url='" + url + '\'' +
                ", contentType='" + contentType + '\'' +
                ", authorization='" + authorization + '\'' +
                ", apiKey='" + apiKey + '\'' +
                ", apiSignature='" + apiSignature + '\'' +
                '}';
    }
}
