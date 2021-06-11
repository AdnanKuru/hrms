package project.hrms.business.abstracts;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import project.hrms.entities.concretes.JobPosition;

import java.util.List;


public interface JobPositionService {

    List<JobPosition> getAll();
}
