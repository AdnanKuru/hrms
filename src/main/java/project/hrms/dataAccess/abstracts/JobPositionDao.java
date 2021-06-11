package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.hrms.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
   JobPosition findByJobName(String jobName);
}
