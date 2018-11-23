/**
 * 
 */
package com.ntl.topjobs.jobapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntl.topjobs.jobapplication.bean.JobApplicationBean;
import com.ntl.topjobs.jobapplication.service.ServiceForJobApplication;

/**
 * @author Training
 *
 */
@RestController
public class JobApplicationController {

	@Autowired
	ServiceForJobApplication serviceForJobApplication;
	
	@PostMapping("/employer/postjobs/job")
	public JobApplicationBean postJobs(@RequestBody JobApplicationBean jobApplicationBean)
	{
		return (serviceForJobApplication.addJob(jobApplicationBean));
	}
	
	@GetMapping("/employer/seeresume/{id}")
	public String seeresume(@PathVariable("id") String id)
	{
		return null;
	//	return (serviceFor)
	}
	
}
