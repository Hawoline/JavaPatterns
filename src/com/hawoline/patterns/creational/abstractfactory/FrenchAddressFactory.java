package com.hawoline.patterns.creational.abstractfactory;

public class FrenchAddressFactory implements AddressFactory {
    @Override
    public Address createAddress() {
        return new FrenchAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new FrenchPhoneNumber();
    }
}
