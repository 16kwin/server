package sigma.server.entity;
import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class ProblemsId implements Serializable {

    private String transaction;
    private String unit;
    private String description;
    private Double norm_horse; 
    private String employees;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProblemsId that = (ProblemsId) o;
        return Objects.equals(transaction, that.transaction) &&
               Objects.equals(unit, that.unit) &&
               Objects.equals(description, that.description) &&
               Objects.equals(norm_horse, that.norm_horse) &&
               Objects.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transaction, unit, description, norm_horse, employees);
    }
}