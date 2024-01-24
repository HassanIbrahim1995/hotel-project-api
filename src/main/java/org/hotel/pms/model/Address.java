package org.hotel.pms.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    @JoinColumn(name = "person_id")
    @Parameter(description = "The person associated with this address")
    @ManyToMany(mappedBy = "addresses")
    @JsonBackReference
    private List<Person> persons;

    public Address(String street, String city, String state, String zipCode, String country, List<Person> persons) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.persons = persons;
    }

    public Address(String street, String city, String state, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }
}
