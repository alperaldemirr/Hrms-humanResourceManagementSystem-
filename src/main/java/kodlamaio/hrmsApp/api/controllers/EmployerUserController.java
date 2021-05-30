package kodlamaio.hrmsApp.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsApp.business.abstracts.EmployerUserService;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.entities.concretes.EmployerUser;

@RestController
@RequestMapping("/api/employerUsers/")
public class EmployerUserController {

	private EmployerUserService employerUserService;

	@Autowired
	public EmployerUserController(EmployerUserService employerUserService) {
		super();
		this.employerUserService = employerUserService;
	}
	
	@GetMapping("getAll")
	DataResult<List<EmployerUser>> getAll(){
		return this.employerUserService.getAll();
	}
	
	@PostMapping("add")
	Result add(@RequestBody EmployerUser employerUser) {
		return this.employerUserService.add(employerUser);
	}
	
	@GetMapping("getByEmailContaining")
	DataResult<List<EmployerUser>> getByMailContaining(String mail){
		return this.employerUserService.getByMailContaining(mail);
	}
	
	
}
