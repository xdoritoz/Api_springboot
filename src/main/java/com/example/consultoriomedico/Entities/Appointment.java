package com.example.consultoriomedico.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Apointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

}
