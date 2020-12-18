package com.hawoline.patterns.creational.abstractfactory;

public abstract class PhoneNumber {
    private String phoneNumber;

    public abstract String getCountryCode();

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        try {
            Long.parseLong(phoneNumber);
            this.phoneNumber = phoneNumber;
        } catch (NumberFormatException exception) {

        }
    }
}
