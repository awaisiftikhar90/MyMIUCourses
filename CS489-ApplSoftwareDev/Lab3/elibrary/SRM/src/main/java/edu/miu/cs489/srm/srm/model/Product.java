package edu.miu.cs489.srm.srm.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productNo;
    private String name;
    private LocalDate dateSupplied;
    private int quantitySupplied;
    private double unitPrice;

    //Multiplicity
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

}
