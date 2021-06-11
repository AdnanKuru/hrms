package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.UserService;
import project.hrms.core.utulities.DataResult;
import project.hrms.core.utulities.ErrorResult;
import project.hrms.core.utulities.SuccessDataResult;
import project.hrms.core.validation.RegexEmailRulesValidate;
import project.hrms.dataAccess.abstracts.UserDao;
import project.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao){
        super();
        this.userDao = userDao;
    }

    @Override
    public void ifCheckInformation(String email, String nationalId) {

        RegexEmailRulesValidate emailRulesValidate = new RegexEmailRulesValidate();
        if(!emailRulesValidate.isEmailValid(email) ){
            new ErrorResult("Hatali mail adresi girildi");
        }else if(getByEmail(email) != null){
            new ErrorResult("Email daha önce kullanılmış.");
        }
    }

    @Override
    public DataResult<User> getByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.getByEmail(email).getData());
    }
}
