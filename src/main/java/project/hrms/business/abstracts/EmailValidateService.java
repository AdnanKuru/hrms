package project.hrms.business.abstracts;

public interface EmailValidateService {
    void sendVerificationCode(String email);
    String verificationCodeGenerate();

}
