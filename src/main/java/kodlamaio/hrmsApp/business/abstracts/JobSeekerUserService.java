package kodlamaio.hrmsApp.business.abstracts;

import java.util.List;

import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.entities.concretes.JobSeekerUser;

public interface JobSeekerUserService {
	
	DataResult<List<JobSeekerUser>>getAll();
	Result add(JobSeekerUser jobSeekerUser);
	

}
