package edu.miu.cs489.citylibraryapp.citylibraryapp.service;

import edu.miu.cs489.citylibraryapp.citylibraryapp.model.Appointment;

import java.util.List;

public interface AppointmentService {
    void addNewAppointment(Appointment appointments);
    List<Appointment> findByDentistName(String name);
}
