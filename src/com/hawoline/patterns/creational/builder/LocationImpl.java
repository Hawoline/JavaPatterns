package com.hawoline.patterns.creational.builder;

public class LocationImpl implements Location {
    private String location;

    public LocationImpl() {}
    public LocationImpl(String location) {
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }
}
