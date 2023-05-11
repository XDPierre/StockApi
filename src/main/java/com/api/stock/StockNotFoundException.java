package com.api.stock;

import org.springframework.http.HttpStatus;

public class StockNotFoundException extends RuntimeException {
    private HttpStatus status;
    private String message;

    public StockNotFoundException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
