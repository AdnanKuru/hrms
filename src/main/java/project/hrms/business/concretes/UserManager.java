package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.UserService;
import project.hrms.core.utulities.DataResult;
import project.hrms.core.utulities.ErrorResult;
import project.hrms.core.utulities.SuccessDataResult;
import project.hrms.core.validation.RegexEmailRulesValidate;
import project.hrms.dataAccess.abstracts.UserDao;
import project.hrms.entities.concretes.JobSeeker;
import project.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {

    private UserDao userDao;
    private JobSeekerManager jobSeekerManager;

    @Autowired
    public UserManager(UserDao userDao,JobSeekerManager jobSeekerManager){
        super();
        this.userDao = userDao;
        this.jobSeekerManager = jobSeekerManager;
    }

    @Override
    public void ifCheckInformation(String email, String nationalId) {

        RegexEmailRulesValidate emailRulesValidate = new RegexEmailRulesValidate();
        if(!emailRulesValidate.isEmailValid(email) ){
            new ErrorResult("Hatali mail adresi girildi");
        }else if(getByEmail(email) != null){
            new ErrorResult("Email daha önce kullanılmış.");
        }else if(jobSeekerManager.getByNationalId(nationalId) != null){
            new ErrorResult(("NationalId daha önce kayıt olmuş"));
        }
    }

    @Override
    public DataResult<User> getByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.getByEmail(email),"Başarılı");
    }


}
