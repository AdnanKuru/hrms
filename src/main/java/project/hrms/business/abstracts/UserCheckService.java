package project.hrms.business.abstracts;


import java.time.LocalDate;

public interface UserCheckService {
    boolean checkIfRealPerson(String fName, String lName, String nationalId, LocalDate birthDate);
}
