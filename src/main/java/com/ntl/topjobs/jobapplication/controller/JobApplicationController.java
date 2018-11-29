/**
 * 
 */
package com.ntl.topjobs.jobapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntl.topjobs.jobapplication.model.JobApplicationDetails;
import com.ntl.topjobs.jobapplication.service.ServiceForJobApplication;

/**
 * @author Training
 *
 */
@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
public class JobApplicationController {

	@Autowired
	ServiceForJobApplication serviceForJobApplication;
	
	
	
	/**
	 * @param serviceForJobApplication
	 */
	public JobApplicationController(ServiceForJobApplication serviceForJobApplication) {
		super();
		this.serviceForJobApplication = serviceForJobApplication;
	}

	/**
	 * 
	 */
	public JobApplicationController() {
		super();
		
	}

	@PostMapping("/employer/postjobs/job")
	public JobApplicationDetails postJobs(@RequestBody JobApplicationDetails jobApplicationBean)
	{
		return (serviceForJobApplication.addJob(jobApplicationBean));
	}
	
	@GetMapping("/employer/seejobs/{id}")
	public List seeJobs(@PathVariable("id") String id)
	{
		return  serviceForJobApplication.viewJobs(id);
	
	}
	
 /*@GetMapping("/employer/seeresume/{id}")
	public String seeresume(@PathVariable("id") String id)
	{
		return null;
	//	return (serviceFor)
	}
	*/
}
