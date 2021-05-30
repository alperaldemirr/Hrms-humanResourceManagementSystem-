package kodlamaio.hrmsApp.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsApp.business.abstracts.JobSeekerUserService;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.entities.concretes.JobSeekerUser;

@RestController
@RequestMapping("api/jobSeekers/")
public class JobSeekerController {

	private JobSeekerUserService jobSeekerUserService;

	public JobSeekerController(JobSeekerUserService jobSeekerUserService) {
		super();
		this.jobSeekerUserService = jobSeekerUserService;
	}
	
	@GetMapping("getAll")
	DataResult<List<JobSeekerUser>>getAll(){
		return this.jobSeekerUserService.getAll();
	}
	
	@PostMapping("add")
	Result add(@RequestBody JobSeekerUser jobSeekerUser) {
		return this.jobSeekerUserService.add(jobSeekerUser);
	}
	
}
