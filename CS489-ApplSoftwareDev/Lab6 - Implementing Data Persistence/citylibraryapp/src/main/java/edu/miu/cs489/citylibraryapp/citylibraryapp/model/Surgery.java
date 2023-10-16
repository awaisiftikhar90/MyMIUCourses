package edu.miu.cs489.citylibraryapp.citylibraryapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Surgery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "Address")
    private Address address;

    @OneToMany
    @JoinColumn(name = "surgery_id")
    private List<Appointment> appointments;
}
