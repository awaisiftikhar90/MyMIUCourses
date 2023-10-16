package edu.miu.cs489.citylibraryapp.citylibraryapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer publisherId;
    private String  name;
    // bi directional onetoOne relation
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address primaryAddress;



}
