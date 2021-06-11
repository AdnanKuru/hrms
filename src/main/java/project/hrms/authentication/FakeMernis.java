package project.hrms.authentication;

import java.time.LocalDate;

public class FakeMernis {

    public boolean nationalIdCheck(String fName, String lName, String nationalId , LocalDate birthDay){
        return true;
    }
}
