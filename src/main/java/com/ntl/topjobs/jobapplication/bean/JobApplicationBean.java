/**
 * 
 */
package com.ntl.topjobs.jobapplication.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.ntl.topjobs.jobapplication.service.ServiceForJobApplication;

/**
 * @author Training
 *
 */
@Entity
public class JobApplicationBean {

	private String jobDescription;
	private String noOfOpenings;
	private String jobProfile;
	private String location;
	private String companyName;
	private LocalDate joiningDate;
	private String empId;
	@Id
	private String jobId;
	@Transient
	ServiceForJobApplication serviceForJobApplication;
	/**
	 * @return the jobDescription
	 */
	public String getJobDescription() {
		return jobDescription;
	}
	/**
	 * @param jobDescription the jobDescription to set
	 */
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	/**
	 * @return the noOfOpenings
	 */
	public String getNoOfOpenings() {
		return noOfOpenings;
	}
	/**
	 * 
	 */
	public JobApplicationBean() {
		super();
		serviceForJobApplication=new ServiceForJobApplication();
	}
	/**
	 * @param noOfOpenings the noOfOpenings to set
	 */
	public void setNoOfOpenings(String noOfOpenings) {
		this.noOfOpenings = noOfOpenings;
	}
	/**
	 * @return the jobProfile
	 */
	public String getJobProfile() {
		return jobProfile;
	}
	/**
	 * @param jobProfile the jobProfile to set
	 */
	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @return the joiningDate
	 */
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	/**
	 * @param joiningDate the joiningDate to set
	 */
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	/**
	 * @return the jobId
	 */
	public String getJobId() {
		return jobId;
	}
	/**
	 * @return the empID
	 */
	public String getEmpId() {
		return empId;
	}
	/**
	 * @param empID the empID to set
	 */
	public void setEmpId(String empId) {  
		this.empId = empId;
	}
	/**
	 * @param jobId the jobId to set
	 */
	public void setJobId() {
		jobId = serviceForJobApplication.generateJobId();
	}
	
}
