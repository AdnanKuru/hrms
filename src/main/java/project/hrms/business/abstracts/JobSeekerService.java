package project.hrms.business.abstracts;

import project.hrms.core.utulities.DataResult;
import project.hrms.entities.concretes.JobSeeker;


import java.util.List;

public interface JobSeekerService {
    DataResult<List<JobSeeker>> getAll();
    DataResult<JobSeeker> getByNationalId(String nationalId);
}
