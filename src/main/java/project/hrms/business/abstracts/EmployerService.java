package project.hrms.business.abstracts;

import project.hrms.core.utulities.DataResult;
import project.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getALl();
}
