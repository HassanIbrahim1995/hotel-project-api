package org.hotel.pms.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String roomNumber;
    private String type;
    private String status;
    @OneToMany(mappedBy = "room")
    private List<Reservation> reservations;
}