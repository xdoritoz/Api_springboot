package com.example.consultoriomedico.Dto.Mapper;

import com.example.consultoriomedico.Dto.PatientDto;
import com.example.consultoriomedico.Entities.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientDto toDto(Patient entity);
    Patient toEntity(PatientDto dto);
}
