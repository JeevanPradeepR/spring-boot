package com.chat.wifichat.wifichat;

public class Modal {
    private String message;

    public Modal(String message) {
        this.message = message;
    }
    public Modal() {
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
