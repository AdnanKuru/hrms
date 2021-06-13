package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.EmployerService;
import project.hrms.core.utulities.DataResult;
import project.hrms.core.utulities.SuccessDataResult;
import project.hrms.dataAccess.abstracts.EmployerDao;
import project.hrms.entities.concretes.Employer;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao){
        this.employerDao = employerDao;
    }

    @Override
    public DataResult<List<Employer>> getALl() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
    }
}
