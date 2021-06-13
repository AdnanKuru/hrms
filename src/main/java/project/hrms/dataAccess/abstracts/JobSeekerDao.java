package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.JobSeeker;

import java.util.List;


public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {

    List<JobSeeker> findAll();
    JobSeeker getByNationalId(String nationalId);
}
