package kodlamaio.hrmsApp.dataAccess.abstracts;

import kodlamaio.hrmsApp.entities.concretes.EmployerUser;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerUserDao extends JpaRepository<EmployerUser, Integer> {
	
	List<EmployerUser> getByMailContaining(String mail);
}
