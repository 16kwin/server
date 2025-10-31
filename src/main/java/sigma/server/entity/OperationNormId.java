package sigma.server.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import java.io.Serializable;
import java.util.Objects;

@Data
@Embeddable
public class OperationNormId implements Serializable {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationNormId that = (OperationNormId) o;
        return Objects.equals(machineType, that.machineType) &&
               Objects.equals(workPpp, that.workPpp) &&
               Objects.equals(specialty, that.specialty) &&
               Objects.equals(operationNorm, that.operationNorm) &&
               Objects.equals(operationOptionPpp, that.operationOptionPpp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(machineType, workPpp, specialty, operationNorm, operationOptionPpp);
    }
}