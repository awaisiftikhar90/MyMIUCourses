package com.example.adsdentalsurgeryappointmentwebapi.service;


import com.example.adsdentalsurgeryappointmentwebapi.model.Appointment;

import java.util.List;

public interface AppointmentService {

    List<Appointment> getAllAppointments();

    Appointment addNewAppointment(Appointment appointment);
}
