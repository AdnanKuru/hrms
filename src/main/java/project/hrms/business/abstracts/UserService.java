package project.hrms.business.abstracts;

import project.hrms.core.utulities.DataResult;
import project.hrms.entities.concretes.User;

public interface UserService {
    void ifCheckInformation(String email, String nationalId);
    DataResult<User> getByEmail(String email);
}
