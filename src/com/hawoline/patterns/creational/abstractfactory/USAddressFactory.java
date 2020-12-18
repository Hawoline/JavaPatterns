package com.hawoline.patterns.creational.abstractfactory;

public class USAddressFactory implements AddressFactory {
    @Override
    public Address createAddress() {
        return new USAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new USPhoneNumber();
    }
}
