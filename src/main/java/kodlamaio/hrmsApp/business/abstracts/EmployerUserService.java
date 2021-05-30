package kodlamaio.hrmsApp.business.abstracts;

import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.entities.concretes.EmployerUser;

import java.util.List;

public interface EmployerUserService {
    DataResult<List<EmployerUser>>getAll();
    Result add(EmployerUser employerUser);
    
    DataResult<List<EmployerUser>> getByMailContaining(String mail);
}
