package kodlamaio.hrmsApp.business.concretes;

import kodlamaio.hrmsApp.business.abstracts.JobPositionService;
import kodlamaio.hrmsApp.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrmsApp.entities.concretes.JobPosition;
import kodlamaio.hrmsApp.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsApp.core.utilities.results.SuccessResult;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {

    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
		this.jobPositionDao = jobPositionDao;
	}

    @Override
    public DataResult<List<JobPosition>> getAll() {
    	return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(), "Data Listelendi");
    }

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("Is Eklendi.");
	}
}
