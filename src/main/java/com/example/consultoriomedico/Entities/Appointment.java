package com.example.consultoriomedico.Entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointments") // Tabla: appointments
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;        // Relación: muchas citas → un paciente

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;          // Relación: muchas citas → un doctor

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "consult_room_id", nullable = false)
    private ConsultRoom consultRoom; // Relación: muchas citas → un consultorio

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status; // Enum: SCHEDULED, COMPLETED, CANCELED
}
