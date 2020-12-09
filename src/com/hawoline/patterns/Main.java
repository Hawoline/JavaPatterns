package com.hawoline.patterns;

import com.hawoline.patterns.abstractfactory.*;

public class Main {
    public static void main(String[] args) {
        AddressFactory addressFactory = new USAddressFactory();

        Address address = addressFactory.createAddress();
        PhoneNumber phoneNumber = addressFactory.createPhoneNumber();

        System.out.println(address.getFullAddress());
        System.out.println(phoneNumber.getCountryCode());
    }
}
