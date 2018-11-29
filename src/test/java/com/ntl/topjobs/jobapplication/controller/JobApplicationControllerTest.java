package com.ntl.topjobs.jobapplication.controller;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

import com.ntl.topjobs.jobapplication.model.JobApplicationDetails;
import com.ntl.topjobs.jobapplication.service.ServiceForJobApplication;
@RunWith(MockitoJUnitRunner.class)
public class JobApplicationControllerTest {

	@Mock
	ServiceForJobApplication serviceForJobApplication;
	JobApplicationDetails jobApplicationBean;
	JobApplicationController jobApplicationController;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPostJobs() {
		jobApplicationBean=new JobApplicationDetails();
		jobApplicationBean.setCompanyName("NIIT");
		jobApplicationBean.setEmpId("bhanu29k");
		jobApplicationBean.setJobDescription("Full Time");
		jobApplicationBean.setJobId();
		jobApplicationBean.setJobProfile("Developer");
		jobApplicationBean.setJoiningDate(LocalDate.now());
		jobApplicationBean.setLocation("Greater Noida");
		jobApplicationBean.setNoOfOpenings("10");
		jobApplicationController=new JobApplicationController(serviceForJobApplication);
		when(serviceForJobApplication.addJob(jobApplicationBean)).thenReturn(jobApplicationBean);
		
		assertEquals("bhanu29k",jobApplicationController.postJobs(jobApplicationBean).getEmpId());
		
	}

	

}
