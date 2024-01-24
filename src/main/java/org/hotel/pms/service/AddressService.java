package org.hotel.pms.service;

import lombok.AllArgsConstructor;
import org.hotel.pms.dto.AddressDto;
import org.hotel.pms.exceptions.AddressNotFoundException;
import org.hotel.pms.mappers.IMapper;
import org.hotel.pms.model.Address;
import org.hotel.pms.repository.AddressRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressService implements IService<AddressDto> {

    private final AddressRepository addressRepository;
    private final IMapper<AddressDto, Address> mapper;

    @Override
    public AddressDto findOneById(long id) {
        return mapper
                .entityToDto(addressRepository.findById(id)
                        .orElseThrow(() -> new AddressNotFoundException(String.valueOf(id))));
    }

    @Override
    public Page<AddressDto> findAllSorted(Pageable pageable) {
        return addressRepository.findAllByOrderByZipCodeAsc(pageable).map(mapper::entityToDto);
    }

    @Override
    public AddressDto updateOne(long id, AddressDto addressDto) {
        Address existingAddress = addressRepository.findById(id)
                .orElseThrow(() -> new AddressNotFoundException(String.valueOf(id)));
        existingAddress.setStreet(addressDto.getStreet());
        existingAddress.setCity(addressDto.getCity());
        existingAddress.setState(addressDto.getState());
        existingAddress.setCountry(addressDto.getCountry());
        existingAddress.setZipCode(addressDto.getZipCode());
        Address updatedAddress = addressRepository.save(existingAddress);
        return mapper.entityToDto(updatedAddress);
    }

    @Override
    public AddressDto saveOne(AddressDto addressDto) {
        Address address = mapper.dtoToEntity(addressDto);
        Address savedAddress = addressRepository.save(address);
        return mapper.entityToDto(savedAddress);
    }

    @Override
    public void deleteOne(long id) {
        if (addressRepository.existsById(id)){
            addressRepository.deleteById(id);
        }else {
            throw new AddressNotFoundException(String.valueOf(id));
        }
    }
}
