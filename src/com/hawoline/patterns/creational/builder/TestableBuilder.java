package com.hawoline.patterns.creational.builder;

import com.hawoline.patterns.Testable;
import com.hawoline.patterns.creational.builder.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class TestableBuilder implements Testable {
    private Calendar dateCreator;

    public TestableBuilder() {
        dateCreator = Calendar.getInstance();
    }
    @Override
    public void test() {
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

    public Date createDate(int year, int month, int day) {
        dateCreator.set(year, month, day);
        return dateCreator.getTime();
    }

    public ArrayList createAttendees(int count) {
        ArrayList attendees = new ArrayList();

        for (int i = 0; i < count; i++) {
            attendees.add(new ContactImpl());
        }

        return attendees;
    }
}
