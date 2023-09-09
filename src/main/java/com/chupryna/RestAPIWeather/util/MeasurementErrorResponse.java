package com.chupryna.RestAPIWeather.util;

import java.util.ArrayList;
import java.util.List;

public class MeasurementErrorResponse {
    private List<String> messages;
    private long timestamp;

    public MeasurementErrorResponse(List<String> messages, long timestamp) {
        this.messages = messages;
        this.timestamp = timestamp;
    }

    public MeasurementErrorResponse(String message, long timestamp) {
        messages = new ArrayList<>();
        messages.add(message);
        this.timestamp = timestamp;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
