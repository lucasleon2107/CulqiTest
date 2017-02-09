package com.culqi.test.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Email;

/**
 * Created by lucas on 9/02/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenRequest {
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("email")
    @Email
    private String email;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("card_number")
    private String cardNumber;
    @JsonProperty("cvv")
    private int cvv;
    @JsonProperty("expiration_month")
    private int expirationMonth;
    @JsonProperty("expiration_year")
    private int expirationYear;

    public TokenRequest() {
    }

    public TokenRequest(String firstName, String lastName, String email, String cardNumber, int cvv, int expirationMonth, int expirationYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.currency = "PEN";
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(int expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }
}
