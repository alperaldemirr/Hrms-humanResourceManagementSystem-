package kodlamaio.hrmsApp.business.concretes;

import java.util.List;

import kodlamaio.hrmsApp.dataAccess.abstracts.JobSeekerUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsApp.business.abstracts.JobSeekerUserService;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsApp.core.utilities.results.SuccessResult;
import kodlamaio.hrmsApp.entities.concretes.JobSeekerUser;

@Service
public class JobSeekerUserManager implements JobSeekerUserService {
	
	private JobSeekerUserDao jobSeekerUserDao;

	@Autowired
	public JobSeekerUserManager(JobSeekerUserDao jobSeekerUserDao) {
		super();
		this.jobSeekerUserDao = jobSeekerUserDao;
	}

	@Override
	public DataResult<List<JobSeekerUser>> getAll() {
		return new SuccessDataResult<List<JobSeekerUser>>(this.jobSeekerUserDao.findAll(), "Is arayanlar listelendi.");
	}

	@Override
	public Result add(JobSeekerUser jobSeekerUser) {
		this.jobSeekerUserDao.save(jobSeekerUser);
		return new SuccessResult("Is veren eklendi.");
	}

}
