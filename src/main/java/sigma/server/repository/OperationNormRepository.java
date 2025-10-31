package sigma.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sigma.server.controller.OperationNormController;
import sigma.server.entity.Employee;
import sigma.server.entity.OperationNew;
import sigma.server.entity.OperationNorm;

public interface OperationNormRepository  extends JpaRepository<OperationNorm, Integer>{

}