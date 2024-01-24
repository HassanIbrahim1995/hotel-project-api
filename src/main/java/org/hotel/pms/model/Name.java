package org.hotel.pms.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Embeddable
@Data
public class Name {
    @NotNull(message = "First name can not be empty")
    private String firstName;
    private String middleName;
    @NotNull(message = "First name can not be empty")
    private String lastName;
}
