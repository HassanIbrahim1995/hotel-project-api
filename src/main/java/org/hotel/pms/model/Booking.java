package org.hotel.pms.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "booking_time")
    private LocalDateTime bookingTime;

    private String status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reservation_id", referencedColumnName = "id")
    private Reservation reservation;

    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guest guest;
}