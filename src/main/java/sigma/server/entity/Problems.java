package sigma.server.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "faults") // Замените на имя вашей таблицы, если оно другое
public class Problems {

    @EmbeddedId
    private ProblemsId id;

    @Column(name = "transaction", insertable = false, updatable = false)
    private String transaction;

    @Column(name = "unit", insertable = false, updatable = false)
    private String unit;

    @Column(name = "description", insertable = false, updatable = false)
    private String description;

    @Column(name = "norm_horse", insertable = false, updatable = false)
    private Double norm_horse;

    @Column(name = "employees", insertable = false, updatable = false)
    private String employees;
}