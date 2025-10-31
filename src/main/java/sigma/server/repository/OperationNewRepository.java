package sigma.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sigma.server.entity.Employee;
import sigma.server.entity.OperationNew;

public interface OperationNewRepository  extends JpaRepository<OperationNew, String>{

}