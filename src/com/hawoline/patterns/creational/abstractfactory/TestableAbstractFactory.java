package com.hawoline.patterns.creational.abstractfactory;

import com.hawoline.patterns.Testable;
import com.hawoline.patterns.creational.abstractfactory.Address;
import com.hawoline.patterns.creational.abstractfactory.AddressFactory;
import com.hawoline.patterns.creational.abstractfactory.PhoneNumber;
import com.hawoline.patterns.creational.abstractfactory.USAddressFactory;

public class TestableAbstractFactory implements Testable {
    @Override
    public void test() {
        AddressFactory addressFactory = new USAddressFactory();

        Address address = addressFactory.createAddress();
        PhoneNumber phoneNumber = addressFactory.createPhoneNumber();

        System.out.println(address.getFullAddress());
        System.out.println(phoneNumber.getCountryCode());
    }
}
