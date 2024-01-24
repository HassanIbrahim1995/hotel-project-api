package org.hotel.pms.mappers;

import org.hotel.pms.dto.AddressDto;
import org.hotel.pms.model.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper implements IMapper<AddressDto, Address> {

    @Override
    public Address dtoToEntity(AddressDto dto) {
        return Address.builder()
                .street(dto.getStreet())
                .city(dto.getCity())
                .state(dto.getState())
                .zipCode(dto.getZipCode())
                .country(dto.getCountry())
                .build();
    }

    @Override
    public AddressDto entityToDto(Address entity) {
        return AddressDto.builder()
                .street(entity.getStreet())
                .city(entity.getCity())
                .state(entity.getState())
                .zipCode(entity.getZipCode())
                .country(entity.getCountry())
                .build();
    }
}
