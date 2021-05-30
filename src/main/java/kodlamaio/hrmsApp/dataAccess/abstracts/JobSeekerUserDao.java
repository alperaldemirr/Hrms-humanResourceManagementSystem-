package kodlamaio.hrmsApp.dataAccess.abstracts;

import kodlamaio.hrmsApp.entities.concretes.JobSeekerUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerUserDao extends JpaRepository<JobSeekerUser, Integer>{

}
