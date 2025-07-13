package sigma.server.entity;
import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class TableId implements Serializable {

    private String stage_ppp;
    private String employee;
    private String transaction;
    private java.sql.Timestamp start_work;
    private java.sql.Timestamp stop_work;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableId that = (TableId) o;
        return Objects.equals(stage_ppp, that.stage_ppp) &&
               Objects.equals(employee, that.employee) &&
               Objects.equals(transaction, that.transaction) &&
               Objects.equals(start_work, that.start_work) &&
               Objects.equals(stop_work, that.stop_work);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stage_ppp, employee, transaction, start_work, stop_work);
    }
}