package com.example.consultoriomedico.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Doctors")
public class Doctor {

    @Id
    private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDoctor;

    private String fullName;
    private String email;
    private String speciality;

    private LocalDate avaliableFrom;
    private LocalDate avaliableTO;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Appointment> appointments = new ArrayList<>();
}
