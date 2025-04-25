package com.example.consultoriomedico.Dto.Mapper;

import com.example.consultoriomedico.Dto.AppointmentDto;
import com.example.consultoriomedico.Entities.Appointment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AppointmentMapper {
    AppointmentDto toDto(Appointment entity);
    Appointment toEntity(AppointmentDto dto);
}
