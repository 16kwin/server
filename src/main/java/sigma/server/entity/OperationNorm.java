package sigma.server.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "operation_norm") // укажите реальное имя таблицы
public class OperationNorm {

   @EmbeddedId
    private OperationNormId id;

    @Column(name = "type_mashine")
    private String machineType;

    @Column(name = "work_ppp")
    private String workPpp;

    @Column(name = "specialty")
    private String specialty;

    @Column(name = "operation_option_norm")
    private Integer operationNorm;

    @Column(name = "operation_option_ppp")
    private String operationOptionPpp;
}