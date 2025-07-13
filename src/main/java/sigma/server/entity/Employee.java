package sigma.server.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="specialization") 
public class Employee {

    @Id
    @Column(name = "employee")
    private String employeeName;

    @Column(name = "specialization")
    private String specialization;

    @Column(name = "specialty")
    private String specialty;
}