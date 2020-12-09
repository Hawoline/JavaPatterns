package com.hawoline.patterns.abstractfactory;

public abstract class Address {
    private String street;
    private String city;
    private String region;
    private String postalCode;

    public static final String EOL_STRING = System.getProperty("line.separator");
    public static final String SPACE = " ";

    public abstract String getCountry();

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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFullAddress() {
        return street + EOL_STRING +
                city + SPACE + postalCode + EOL_STRING;
    }
}
