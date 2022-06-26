package com.assignment.flow.extblocker.dto;

public class CustomExtRequest {
    private String ext;

    public CustomExtRequest() {
    }

    public CustomExtRequest(String ext) {
        this.ext = ext;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Override
    public String toString() {
        return "Custom input{" +
                "custom ext=" + ext +
                '}';
    }

}
