package org.hotel.pms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDto {

    @Parameter(description = "The street of the address")
    @NotBlank(message = "Street cannot be blank")
    @Size(max = 100, message = "Street name cannot exceed 100 characters")
    private String street;

    @Parameter(description = "The city of the address")
    @NotBlank(message = "City cannot be blank")
    private String city;

    @Parameter(description = "The state of the address")
    @NotBlank(message = "State cannot be blank")
    private String state;

    @Parameter(description = "The ZIP code of the address")
    @NotBlank(message = "Zip code cannot be blank")
    @Size(min = 5, max = 10, message = "Zip code must be between 5 and 10 characters")
    @JsonProperty("zip-code")
    private String zipCode;

    @Parameter(description = "The country of the address")
    @NotBlank(message = "Country cannot be blank")
    private String country;

    @JsonProperty("associatedPersons")
    private List<PersonDto> persons;

}
