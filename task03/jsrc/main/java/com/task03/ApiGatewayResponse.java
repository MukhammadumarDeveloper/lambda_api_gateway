package com.task03;

public class ApiGatewayResponse {
    private int statusCode;
    private String message;

    public ApiGatewayResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }
}
