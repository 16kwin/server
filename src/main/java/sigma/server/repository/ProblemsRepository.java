package sigma.server.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sigma.server.entity.Problems;
import sigma.server.entity.ProblemsId;

@Repository
public interface ProblemsRepository extends JpaRepository<Problems, ProblemsId> {
}