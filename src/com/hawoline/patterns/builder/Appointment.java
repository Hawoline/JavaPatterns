package com.hawoline.patterns.builder;

import java.util.ArrayList;
import java.util.Date;

public class Appointment {
    private Date startDate;
    private Date endDate;
    private String description;
    private ArrayList attendees = new ArrayList();
    private Location location;

    public static final String EOL_STRING = System.getProperty("line.separator");

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList getAttendees() {
        return attendees;
    }

    public void setAttendees(ArrayList attendees) {
        this.attendees = attendees;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void addAttendee(Contact attendee) {
        if (!attendees.contains(attendee)) {
            attendees.add(attendee);
        }
    }

    public void removeAttendee(Contact attendee) {
        attendees.remove(attendee);
    }

    @Override
    public String toString() {
        return "Description: " + description + EOL_STRING +
                "Start Date: " + startDate + EOL_STRING +
                "EndDate: " + endDate + EOL_STRING +
                "Attendees: " + attendees + EOL_STRING +
                "Location: " + location.getLocation() + EOL_STRING;
    }
}
