package com.hawoline.patterns.creational.prototype;

import com.hawoline.patterns.Testable;

public class TestablePrototype implements Testable {
    @Override
    public void test() {
        Address address = new Address("small", "dfmkfd", "skdmfksldf", "sdfsd", "ss");

        Address copiedAddress = (Address) address.copy();
        System.out.println(copiedAddress.getCity());
    }
}
