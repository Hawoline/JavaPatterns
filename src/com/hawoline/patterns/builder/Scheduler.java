package com.hawoline.patterns.builder;

import java.util.ArrayList;
import java.util.Date;

public class Scheduler {
    public Appointment createAppointment(
            AppointmentBuilder appointmentBuilder,
            Date startDate,
            Date endDate,
            String description,
            ArrayList attendees,
            Location location) throws InformationRequiredException {
        if (appointmentBuilder != null) {
            appointmentBuilder = new AppointmentBuilder();
        }

        appointmentBuilder.buildAppointment();
        appointmentBuilder.buildDates(startDate, endDate);
        appointmentBuilder.buildDescription(description);
        appointmentBuilder.buildAttendees(attendees);
        appointmentBuilder.buildLocation(location);

        return appointmentBuilder.getAppointment();
    }
}
