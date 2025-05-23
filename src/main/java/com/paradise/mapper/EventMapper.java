package com.paradise.mapper;

import com.paradise.dto.EventDto;
import com.paradise.domain.entities.Event;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper {

    Event toEntity(EventDto eventDto);

    EventDto toDto(Event event);


}
