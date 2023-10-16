package edu.miu.cs489.citylibraryapp.citylibraryapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDate date;
    private LocalTime time;

    @ManyToOne
    @JoinColumn
    private Dentist dentist;

    @ManyToOne
    @JoinColumn
    private Patient patient;

}
