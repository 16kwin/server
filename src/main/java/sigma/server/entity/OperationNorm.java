package sigma.server.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "operation_norm")
public class OperationNorm {

    @EmbeddedId
    private OperationNormId id;

    @Column(name = "type_mashine", insertable = false, updatable = false)
    private String machineType;

    @Column(name = "work_ppp", insertable = false, updatable = false)
    private String workPpp;

    @Column(name = "specialty", insertable = false, updatable = false)
    private String specialty;

    @Column(name = "operation_option_norm", insertable = false, updatable = false)
    private Integer operationNorm;

    @Column(name = "operation_option_ppp", insertable = false, updatable = false)
    private String operationOptionPpp;
}