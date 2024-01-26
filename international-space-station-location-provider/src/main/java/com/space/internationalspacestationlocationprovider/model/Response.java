package com.space.internationalspacestationlocationprovider.model;

public class Response {
    private Iss_Location iss_position;
    private String message;

    public Iss_Location getIss_position() {
        return iss_position;
    }

    public void setIss_position(Iss_Location iss_position) {
        this.iss_position = iss_position;
    }

    private String timestamp;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
