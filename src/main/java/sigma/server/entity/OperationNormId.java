package sigma.server.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@Embeddable
public class OperationNormId implements Serializable {

    @Column(name = "work_ppp")
    private String workPpp;

    @Column(name = "specialty")
    private String specialty;

    @Column(name = "operation_option_norm")
    private BigDecimal operationNorm;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationNormId that = (OperationNormId) o;
        return Objects.equals(workPpp, that.workPpp) &&
               Objects.equals(specialty, that.specialty) &&
               Objects.equals(operationNorm, that.operationNorm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workPpp, specialty, operationNorm);
    }
}