package org.hotel.pms.mappers;

import org.hotel.pms.dto.PersonDto;
import org.hotel.pms.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper implements IMapper<PersonDto, Person>{

    @Override
    public Person dtoToEntity(PersonDto dto) {
        return null;
    }

    @Override
    public PersonDto entityToDto(Person entity) {
        return null;
    }
}
