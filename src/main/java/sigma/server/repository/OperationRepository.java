package sigma.server.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sigma.server.entity.Operation;
import sigma.server.entity.TableId;

@Repository
public interface OperationRepository extends JpaRepository<Operation, TableId> {
}