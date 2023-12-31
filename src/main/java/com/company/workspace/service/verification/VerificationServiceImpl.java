package com.company.workspace.service.verification;

import com.company.workspace.handler.UserRegistrationException;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class VerificationServiceImpl implements VerificationService{


    @Override
    public String createVerificationCode() {
        System.out.println("------------------| createVerificationCode |------------------");
        int min = 0;
        int max = 9;
        Random random = new Random();
        int randomNumber1 = random.nextInt(max - min + 1) + min;
        int randomNumber2 = random.nextInt(max - min + 1) + min;
        int randomNumber3 = random.nextInt(max - min + 1) + min;
        int randomNumber4 = random.nextInt(max - min + 1) + min;
        int randomNumber5 = random.nextInt(max - min + 1) + min;
        int randomNumber6 = random.nextInt(max - min + 1) + min;
        String number = String.valueOf(randomNumber1) + randomNumber2 + randomNumber3 + randomNumber4 + randomNumber5 + randomNumber6;
        System.out.println("Random Number is ---- " + number);
        return number;
    }

    @Override
    public void checkVerificationCode(String code, String inputCode) {
        if (!code.equals(inputCode)) {
            throw new UserRegistrationException("Verification code was wrong, go back to the registration form and try again");
        }
    }
}