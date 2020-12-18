package com.hawoline.patterns.creational.abstractfactory;

public interface AddressFactory {
    Address createAddress();

    PhoneNumber createPhoneNumber();
}
