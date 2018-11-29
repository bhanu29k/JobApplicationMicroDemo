/**
 * 
 */
package com.ntl.topjobs.jobapplication.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntl.topjobs.jobapplication.dao.JobApplicationDao;
import com.ntl.topjobs.jobapplication.model.JobApplicationDetails;

/**
 * @author Training
 *
 */
@Service
public class ServiceForJobApplication {

	@Autowired
	JobApplicationDao jobApplicationDao;
	
	

	/**
	 * @param jobApplicationDao
	 */
	public ServiceForJobApplication(JobApplicationDao jobApplicationDao) {
		super();
		this.jobApplicationDao = jobApplicationDao;
	}

	/**
	 * 
	 */
	public ServiceForJobApplication() {
		super();
		
	}

	public JobApplicationDetails addJob(JobApplicationDetails jobApplicationBean)
	{
		jobApplicationBean.setJobId();
		return (jobApplicationDao.save(jobApplicationBean));
	}

	public List<JobApplicationDetails> viewJobs(String empid)
	{
		return  jobApplicationDao.findByEmpId(empid);	
	}
	
	public String generateJobId() {
		
		Random randomNo=new Random();
		int x=1000+randomNo.nextInt(9000);
		String str=Integer.toString(x);
		char[] a= {str.charAt(0),str.charAt(1),str.charAt(2),str.charAt(3)};
		return (new String(a));
	}
}
