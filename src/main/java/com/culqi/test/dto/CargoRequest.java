package com.culqi.test.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Email;

import java.util.UUID;

/**
 * Created by lucas on 9/02/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CargoRequest {
    @JsonIgnoreProperties("token_id")
    private String tokenId;
    @JsonIgnoreProperties("order_id")
    private String orderId;
    @JsonIgnoreProperties("first_name")
    private String firstName;
    @JsonIgnoreProperties("last_name")
    private String lastName;
    @JsonIgnoreProperties("email")
    @Email
    private String email;
    @JsonIgnoreProperties("address")
    private String address;
    @JsonIgnoreProperties("address_city")
    private String addressCity;
    @JsonIgnoreProperties("phone_number")
    private String phoneNumber;
    @JsonIgnoreProperties("country_code")
    private String countryCode;
    @JsonIgnoreProperties("currency_code")
    private String currencyCode;
    @JsonIgnoreProperties("amount")
    private int amount;
    @JsonIgnoreProperties("installments")
    private int installments;
    @JsonIgnoreProperties("product_description")
    private String productDescription;
    @JsonIgnoreProperties("cvv")
    private int cvv;

    public CargoRequest() {
    }

    public CargoRequest(String tokenId, String firstName, String lastName, String email, String address, String addressCity, String phoneNumber, int amount, int cvv) {
        this.tokenId = tokenId;
        this.orderId = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.addressCity = addressCity;
        this.phoneNumber = phoneNumber;
        this.countryCode = "PE";
        this.currencyCode = "PEN";
        this.amount = amount;
        this.installments = 0;
        this.productDescription = "Test Charge";
        this.cvv = cvv;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getInstallments() {
        return installments;
    }

    public void setInstallments(int installments) {
        this.installments = installments;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
