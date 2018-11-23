/**
 * 
 */
package com.ntl.topjobs.jobapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntl.topjobs.jobapplication.bean.JobApplicationBean;
import com.ntl.topjobs.jobapplication.dao.JobApplicationDao;

/**
 * @author Training
 *
 */
@Service
public class ServiceForJobApplication {

	@Autowired
	JobApplicationDao jobApplicationDao;
	
	public JobApplicationBean addJob(JobApplicationBean jobApplicationBean)
	{
		jobApplicationBean.setJobId();
		return (jobApplicationDao.save(jobApplicationBean));
	}

	public String generateJobId() {
		int x = (int)(Math.random()*((9999-1000)+1))+1000;
		 String str=Integer.toString(x);
		char a[]= {str.charAt(0),str.charAt(1),str.charAt(2),str.charAt(3)};
		return (new String(a));
	}
}
