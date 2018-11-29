/**
 * 
 */
package com.ntl.topjobs.jobapplication.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ntl.topjobs.jobapplication.dao.JobApplicationDao;
import com.ntl.topjobs.jobapplication.model.JobApplicationDetails;

import static org.mockito.Mockito.when;

import java.time.LocalDate;
/**
 * @author Training
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ServiceForJobApplicationTest {

	@Mock
	JobApplicationDao jobApplicationDao;
	JobApplicationDetails jobApplicationBean;
	ServiceForJobApplication serviceForJobApplication;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.ntl.topjobs.jobapplication.service.ServiceForJobApplication#addJob(com.ntl.topjobs.jobapplication.model.JobApplicationDetails)}.
	 */
	@Test
	public void testAddJob() {
		jobApplicationBean=new JobApplicationDetails();
		jobApplicationBean.setCompanyName("NIIT");
		jobApplicationBean.setEmpId("bhanu29k");
		jobApplicationBean.setJobDescription("Full Time");
		jobApplicationBean.setJobId();
		jobApplicationBean.setJobProfile("Developer");
		jobApplicationBean.setJoiningDate(LocalDate.now());
		jobApplicationBean.setLocation("Greater Noida");
		jobApplicationBean.setNoOfOpenings("10");
		when(jobApplicationDao.save(jobApplicationBean)).thenReturn(jobApplicationBean);
		serviceForJobApplication=new ServiceForJobApplication(jobApplicationDao);
		assertEquals("bhanu29k",serviceForJobApplication.addJob(jobApplicationBean).getEmpId());
	}



}
