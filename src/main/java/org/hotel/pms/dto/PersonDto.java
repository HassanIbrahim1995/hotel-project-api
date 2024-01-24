package org.hotel.pms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;
import lombok.*;
import org.hotel.pms.model.Name;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDto {
    @JsonProperty("id")
    @Nullable
    private Long id;

    @JsonProperty("name")
    private Name name;

    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @JsonProperty("dateOfBirth")
    private LocalDate dateOfBirth;

    @JsonProperty("associatedAddresses")
    private List<AddressDto> addresses;
}