package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobSeekerService;
import project.hrms.core.utulities.DataResult;
import project.hrms.core.utulities.SuccessDataResult;
import project.hrms.dataAccess.abstracts.JobSeekerDao;
import project.hrms.entities.concretes.JobSeeker;
import project.hrms.entities.concretes.User;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        this.jobSeekerDao = jobSeekerDao;
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll());
    }

    @Override
    public DataResult<JobSeeker> getByNationalId(String nationalId) {
        return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getByNationalId(nationalId),"Başarılı");
    }
}
