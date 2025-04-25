package com.example.consultoriomedico.Dto.Mapper;

import com.example.consultoriomedico.Dto.ConsultRoomDto;
import com.example.consultoriomedico.Entities.ConsultRoom;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConsultRoomMapper {
    ConsultRoomDto toDto(ConsultRoom entity);
    ConsultRoom toEntity(ConsultRoomDto dto);
}
