package sigma.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sigma.server.entity.OperationNorm;
import sigma.server.entity.OperationNormId;

public interface OperationNormRepository extends JpaRepository<OperationNorm, OperationNormId> {

}