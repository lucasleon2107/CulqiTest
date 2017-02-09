package com.culqi.test.dto;

/**
 * Created by Ger_VENTAS on 09/02/2017.
 */
public class UsuarioForm {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String addressCity;
    private String phoneNumber;
    private int amount;
    private String cardNumber;
    private int cvv;
    private int expirationMonth;
    private int expirationYear;

    public UsuarioForm() {
    }

    public UsuarioForm(String firstName, String lastName, String email, String address, String addressCity, String phoneNumber, int amount, String cardNumber, int cvv, int expirationMonth, int expirationYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.addressCity = addressCity;
        this.phoneNumber = phoneNumber;
        this.amount = amount;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
