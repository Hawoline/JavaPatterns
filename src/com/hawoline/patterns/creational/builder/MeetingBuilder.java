package com.hawoline.patterns.creational.builder;

public class MeetingBuilder extends AppointmentBuilder {
    @Override
    public Appointment getAppointment() throws InformationRequiredException {
        try {
            super.getAppointment();
        } finally {
            if (appointment.getEndDate() == null) {
                requiredElements++;
            }

            if (requiredElements > 0) {
                throw  new InformationRequiredException(requiredElements);
            }
        }

        return appointment;
    }
}
