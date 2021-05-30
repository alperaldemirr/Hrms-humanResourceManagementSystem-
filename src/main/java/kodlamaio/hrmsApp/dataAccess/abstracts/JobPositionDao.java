package kodlamaio.hrmsApp.dataAccess.abstracts;

import kodlamaio.hrmsApp.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
}
