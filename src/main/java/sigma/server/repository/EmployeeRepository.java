package sigma.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sigma.server.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, String>{

}