package sigma.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sigma.server.entity.OperationNew;
import sigma.server.entity.OperationNewId;

@Repository
public interface OperationNewRepository extends JpaRepository<OperationNew, OperationNewId> {
}