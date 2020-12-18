package com.hawoline.patterns.creational.builder;

public class InformationRequiredException extends Exception {
    private static final String MESSAGE = "Appointment cannot be created because further information is required. Count: ";
    private int informationRequired;
    public InformationRequiredException(int requiredElements) {
        super(MESSAGE + requiredElements);

        informationRequired = requiredElements;
    }

    public int getInformationRequired() {
        return informationRequired;
    }
}
