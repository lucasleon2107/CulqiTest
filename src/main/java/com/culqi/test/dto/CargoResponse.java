package com.culqi.test.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Ger_VENTAS on 09/02/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CargoResponse {
    @JsonProperty("id")
    private String id;
    @JsonProperty("user_message")
    private String userMessage;

    public CargoResponse() {
    }

    public CargoResponse(String id, String userMessage) {
        this.id = id;
        this.userMessage = userMessage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }
}
