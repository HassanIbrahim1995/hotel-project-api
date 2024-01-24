package org.hotel.pms.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.hotel.pms.dto.AddressDto;
import org.hotel.pms.service.AddressService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/address")
@AllArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/all")
    public Page<AddressDto> getAll(@PageableDefault(size = 100) Pageable pageable){
        return addressService.findAllSorted(pageable);
    }

    @GetMapping("/{id}")
    public AddressDto getAddressById(@PathVariable long id){
        return addressService.findOneById(id);
    }

    @PutMapping("/{id}")
    public AddressDto updateAddress(@PathVariable long id, @RequestBody @Valid AddressDto addressDto) {
        return addressService.updateOne(id, addressDto);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddressDto createAddress(@RequestBody @Valid AddressDto addressDto) {
        return addressService.saveOne(addressDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAddress(@PathVariable long id) {
        addressService.deleteOne(id);
    }

}
