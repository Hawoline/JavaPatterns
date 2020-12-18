package com.hawoline.patterns.creational.abstractfactory;

public class FrenchPhoneNumber extends PhoneNumber {
    private static final String COUNTRY_CODE = "33";
    private static final int PHONE_LENGTH = 10;

    @Override
    public String getCountryCode() {
        return COUNTRY_CODE;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == PHONE_LENGTH) {
            super.setPhoneNumber(phoneNumber);
        }
    }
}
