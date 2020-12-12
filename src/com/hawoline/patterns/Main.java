package com.hawoline.patterns;

import com.hawoline.patterns.abstractfactory.*;
import com.hawoline.patterns.builder.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {
    private static Calendar dateCreator = Calendar.getInstance();
    public static void main(String[] args) {
        testBuilder();
    }

    public static void testAbstractFactory() {
        AddressFactory addressFactory = new USAddressFactory();

        Address address = addressFactory.createAddress();
        PhoneNumber phoneNumber = addressFactory.createPhoneNumber();

        System.out.println(address.getFullAddress());
        System.out.println(phoneNumber.getCountryCode());
    }

    public static void testBuilder() {
        Appointment appointment = null;
        AppointmentBuilder meetingBuilder = new AppointmentBuilder();

        Scheduler scheduler = new Scheduler();
        dateCreator.set(2020, Calendar.DECEMBER, 29);
        try {
            appointment = scheduler.createAppointment(meetingBuilder,
                    createDate(2020, Calendar.DECEMBER, 29),
                    createDate(2020, Calendar.DECEMBER, 30),
                    "jdfsbj",
                    createAttendees(10),
                    new LocationImpl("jsbdvjhb"));
        } catch (InformationRequiredException e) {
            e.printStackTrace();
        }

        System.out.println(appointment.toString());
    }

    public static Date createDate(int year, int month, int day) {
        dateCreator.set(year, month, day);
        return dateCreator.getTime();
    }

    public static ArrayList createAttendees(int count) {
        ArrayList attendees = new ArrayList();

        for (int i = 0; i < count; i++) {
            attendees.add(new ContactImpl());
        }

        return attendees;
    }
}
