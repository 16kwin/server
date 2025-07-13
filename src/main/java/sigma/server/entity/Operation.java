package sigma.server.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "work_report_ppp")
public class Operation {

    @EmbeddedId
    private TableId id;

    @Column(name = "stage_ppp", insertable = false, updatable = false)
    private String stagePpp;

    @Column(name = "employee", insertable = false, updatable = false)
    private String employee;

    @Column(name = "transaction", insertable = false, updatable = false)
    private String transaction;

    @Column(name = "start_work", insertable = false, updatable = false)
    private java.sql.Timestamp startWork;

    @Column(name = "stop_work", insertable = false, updatable = false)
    private java.sql.Timestamp stopWork;

}