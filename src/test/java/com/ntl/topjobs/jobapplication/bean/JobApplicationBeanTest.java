/**
 * 
 */
package com.ntl.topjobs.jobapplication.bean;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ntl.topjobs.jobapplication.model.JobApplicationDetails;

/**
 * @author Training
 *
 */
public class JobApplicationBeanTest {

	JobApplicationDetails jobApplicationBean;
	
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
	 * Test method for {@link com.ntl.topjobs.jobapplication.model.JobApplicationDetails#setJobDescription(java.lang.String)}.
	 */
	@Test
	public void testSetJobDescription() {
	jobApplicationBean=new JobApplicationDetails();
	jobApplicationBean.setJobDescription("Full Time");
	assertEquals("Full Time",jobApplicationBean.getJobDescription());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.jobapplication.model.JobApplicationDetails#setNoOfOpenings(java.lang.String)}.
	 */
	@Test
	public void testSetNoOfOpenings() {
		jobApplicationBean=new JobApplicationDetails();
		jobApplicationBean.setNoOfOpenings("12");
		assertEquals("12",jobApplicationBean.getNoOfOpenings());	
	}

	/**
	 * Test method for {@link com.ntl.topjobs.jobapplication.model.JobApplicationDetails#setJobProfile(java.lang.String)}.
	 */
	@Test
	public void testSetJobProfile() {
		jobApplicationBean=new JobApplicationDetails();
		jobApplicationBean.setJobProfile("Software Developer");
		assertEquals("Software Developer",jobApplicationBean.getJobProfile());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.jobapplication.model.JobApplicationDetails#setLocation(java.lang.String)}.
	 */
	@Test
	public void testSetLocation() {
		jobApplicationBean=new JobApplicationDetails();
		jobApplicationBean.setLocation("Greater Noida");
		assertEquals("Greater Noida",jobApplicationBean.getLocation());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.jobapplication.model.JobApplicationDetails#setCompanyName(java.lang.String)}.
	 */
	@Test
	public void testSetCompanyName() {
		jobApplicationBean=new JobApplicationDetails();
		jobApplicationBean.setCompanyName("NIIT");
		assertEquals("NIIT",jobApplicationBean.getCompanyName());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.jobapplication.model.JobApplicationDetails#setJoiningDate(java.time.LocalDate)}.
	 */
	@Test
	public void testSetJoiningDate() {
		jobApplicationBean=new JobApplicationDetails();
		jobApplicationBean.setJoiningDate(LocalDate.now());
		assertEquals(LocalDate.now(),jobApplicationBean.getJoiningDate());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.jobapplication.model.JobApplicationDetails#setEmpId(java.lang.String)}.
	 */
	@Test
	public void testSetEmpId() {
		jobApplicationBean=new JobApplicationDetails();
		jobApplicationBean.setEmpId("bhanu29k");
		assertEquals("bhanu29k",jobApplicationBean.getEmpId());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.jobapplication.model.JobApplicationDetails#setJobId()}.
	 */
	@Test
	public void testSetJobId() {
		jobApplicationBean=new JobApplicationDetails();
		jobApplicationBean.setJobId();
		assertEquals(4,jobApplicationBean.getJobId().length());
	}

}
