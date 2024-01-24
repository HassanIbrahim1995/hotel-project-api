package org.hotel.pms.model;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Employee")
public class Employee extends Person {

    @Column(name = "employee_id")
    private String employeeId;

    private String position;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
