package kodlamaio.hrmsApp.business.concretes;

import kodlamaio.hrmsApp.business.abstracts.EmployerUserService;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsApp.core.utilities.results.SuccessResult;
import kodlamaio.hrmsApp.dataAccess.abstracts.EmployerUserDao;
import kodlamaio.hrmsApp.entities.concretes.EmployerUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployerUserManager implements EmployerUserService {

    private EmployerUserDao employerUserDao;

    @Autowired
	public EmployerUserManager(EmployerUserDao employerUserDao) {
		this.employerUserDao = employerUserDao;
	}

	@Override
	public DataResult<List<EmployerUser>> getAll() {
		return new SuccessDataResult<List<EmployerUser>>(this.employerUserDao.findAll(), "Isverenler listelendi.");
	}

	@Override
	public Result add(@RequestBody EmployerUser employerUser) {
		this.employerUserDao.save(employerUser);
		return new SuccessResult("Is veren eklendi.");
	}

	@Override
	public DataResult<List<EmployerUser>> getByMailContaining(String mail) {
		return new SuccessDataResult<List<EmployerUser>>(this.employerUserDao.getByMailContaining(mail), "Isveren e-mail adresleri listelendi.");
	}
}
