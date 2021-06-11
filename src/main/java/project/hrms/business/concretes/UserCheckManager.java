package project.hrms.business.concretes;

import project.hrms.authentication.FakeMernis;
import project.hrms.business.abstracts.UserCheckService;

import java.time.LocalDate;

public class UserCheckManager implements UserCheckService {
    @Override
    public boolean checkIfRealPerson(String fName, String lName, String nationalId, LocalDate birthDate) {

        FakeMernis mernis = new FakeMernis();

        return mernis.nationalIdCheck(fName,lName,nationalId,birthDate);
    }
}
