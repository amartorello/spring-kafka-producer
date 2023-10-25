package com.amartorello.springkafkaproducer.model;

import java.util.Map;

public class EventMessage {
    private Map<String, Object> headers;
    private Object body;

    public EventMessage() {
    }

    public EventMessage(Map<String, Object> headers, Object body) {
        this.headers = headers;
        this.body = body;
    }

    public Map<String, Object> getHeaders() {
        return this.headers;
    }

    public void setHeaders(Map<String, Object> headers) {
        this.headers = headers;
    }

    public Object getBody() {
        return this.body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

}
