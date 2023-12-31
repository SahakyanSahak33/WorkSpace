package com.company.workspace.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail,String> {

    private String endOfEmail;
    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail = checkEmail.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        return s.endsWith(endOfEmail);
    }
}