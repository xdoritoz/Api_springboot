package com.example.consultoriomedico.Dto;

import java.time.LocalDateTime;

public class MedicalRecordDto {
    private Long id;
    private Long appointmentId;
    private Long patientId;
    private String diagnosis;
    private String notes;
    private LocalDateTime createdAt;
}
