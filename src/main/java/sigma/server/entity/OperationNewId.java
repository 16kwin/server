package sigma.server.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Embeddable
public class OperationNewId implements Serializable {

    @Column(name = "transaction")
    private String transaction;

    @Column(name = "work_ppp")
    private String workPpp;

    @Column(name = "start")
    private LocalDateTime start;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationNewId that = (OperationNewId) o;
        return Objects.equals(transaction, that.transaction) &&
               Objects.equals(workPpp, that.workPpp) &&
               Objects.equals(start, that.start);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transaction, workPpp, start);
    }
}