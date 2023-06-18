package Requests

import Model.Header
import Model.Payload

class Request {

    Header header
    Payload payload

    Request() {
    }

    Request(Header header, Payload payload) {
        this.header = header
        this.payload = payload
    }

    Header getHeader() {
        return header
    }

    void setHeader(Header header) {
        this.header = header
    }

    Payload getPayload() {
        return payload
    }

    void setPayload(Payload payload) {
        this.payload = payload
    }

    @Override
    public String toString() {
        return "Request{" +
                "header=" + header +
                ", payload=" + payload +
                '}';
    }
}
