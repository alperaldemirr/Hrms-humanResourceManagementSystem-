package kodlamaio.hrmsApp.business.abstracts;

import kodlamaio.hrmsApp.entities.concretes.JobPosition;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;

import java.util.List;

public interface JobPositionService { 
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
}
