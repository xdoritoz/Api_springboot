package com.example.consultoriomedico.Dto.Mapper;

import com.example.consultoriomedico.Dto.MedicalRecordDto;
import com.example.consultoriomedico.Entities.MedicalRecord;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedicalRecordMapper {
    MedicalRecordDto toDto(MedicalRecord Entity);
    MedicalRecord toEntity(MedicalRecordDto dto);
}
