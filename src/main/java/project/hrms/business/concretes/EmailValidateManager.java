package project.hrms.business.concretes;

import project.hrms.business.abstracts.EmailValidateService;

import java.util.UUID;

public class EmailValidateManager implements EmailValidateService {
    @Override
    public void sendVerificationCode(String email) {

    }

    @Override
    public String verificationCodeGenerate() {
        UUID code = UUID.randomUUID();
        return code.toString();
    }
}
