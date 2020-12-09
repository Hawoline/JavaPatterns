package com.hawoline.patterns.abstractfactory;

public interface AddressFactory {
    Address createAddress();

    PhoneNumber createPhoneNumber();
}
