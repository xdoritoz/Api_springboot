package com.example.consultoriomedico.Dto;

import com.example.consultoriomedico.Entities.AppointmentStatus;

import java.time.LocalDateTime;

public class AppointmentDto {
    private Long id;
    private Long patientId;
    private Long doctorId;
    private Long consultRoomId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private AppointmentStatus status;

}
