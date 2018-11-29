/**
 * 
 */
package com.ntl.topjobs.jobapplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntl.topjobs.jobapplication.model.JobApplicationDetails;

/**
 * @author Training
 *
 */
@Repository
public interface JobApplicationDao extends JpaRepository<JobApplicationDetails, String> {
	public List<JobApplicationDetails> findByEmpId(String empid);
}
