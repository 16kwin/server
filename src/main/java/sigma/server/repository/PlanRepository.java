package sigma.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sigma.server.entity.PlanPPP;

import java.util.List;

public interface PlanRepository  extends JpaRepository<PlanPPP, String>{

    List<PlanPPP> findByAvailability(String availability);
}