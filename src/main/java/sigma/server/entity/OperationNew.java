package sigma.server.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "operation")
public class OperationNew {

    @EmbeddedId
    private OperationNewId id;

    @Column(name = "transaction", insertable = false, updatable = false)
    private String transaction;

    @Column(name = "work_ppp", insertable = false, updatable = false)
    private String workPpp;

    @Column(name = "start", insertable = false, updatable = false)
    private LocalDateTime start;

    @Column(name = "stage_ppp")
    private String stagePpp;

    @Column(name = "status_work_ppp")
    private String statusWorkPpp;

    @Column(name = "stop")
    private LocalDateTime stop;

    @Column(name = "employees")
    private String employees;

    @Column(name = "status_ppp")
    private String statusPpp;
}