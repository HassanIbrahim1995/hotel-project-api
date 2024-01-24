package org.hotel.pms.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
@DiscriminatorValue("GUEST")
public class Guest extends Person {

    @OneToMany(mappedBy = "guest")
    private List<Reservation> reservations;

}
