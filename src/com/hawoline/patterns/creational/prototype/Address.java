package com.hawoline.patterns.creational.prototype;

public class Address implements Copyable {
    private String type;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    public static final String EOL_String = System.getProperty("line.separator");
    public static final String COMMA = ",";
    public static final String HOME = "home";
    public static final String WORK = "work";

    public Address(String type) {
        this.type = type;
    }

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address(String type, String street, String city, String state, String zipCode) {
        this.type = type;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public Object copy() {
        return new Address(street, city, state, zipCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "type='" + type + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
