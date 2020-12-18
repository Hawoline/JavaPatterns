package com.hawoline.patterns;

import com.hawoline.patterns.creational.prototype.TestablePrototype;

public class Main {
    public static void main(String[] args) {
        Testable test = new TestablePrototype();
        test.test();
    }
}
