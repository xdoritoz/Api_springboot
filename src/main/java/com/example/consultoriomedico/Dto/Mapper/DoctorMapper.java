package com.example.consultoriomedico.Dto.Mapper;

import com.example.consultoriomedico.Dto.DoctorDto;
import com.example.consultoriomedico.Entities.Doctor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DoctorMapper {
    DoctorDto toDto(Doctor entity);
    Doctor toEntity(DoctorDto dto);
}
