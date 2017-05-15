package com.cognizant.ams.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cognizant.ams.vo.AgentDetailsVO;

@Component("agentValidator")
public class AgentFormValidator implements Validator {

    @Autowired
    @Qualifier("emailValidator")
    EmailValidator emailValidator;

    @Override
    public void validate(Object target, Errors errors) {

        AgentDetailsVO AgentDetailsVO = (AgentDetailsVO) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty.userForm.name");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dob", "NotEmpty.userForm.dob");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pc", "NotEmpty.userForm.pc");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ac", "NotEmpty.userForm.ac");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty.userForm.email");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "state", "NotEmpty.userForm.state");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "NotEmpty.userForm.city");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", "NotEmpty.userForm.country");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pin", "NotEmpty.userForm.pin");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "doj", "NotEmpty.userForm.doj");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "jobType", "NotEmpty.userForm.jobType");

        if (!emailValidator.valid(AgentDetailsVO.getEmail())) {
            errors.rejectValue("email", "Pattern.userForm.email");
        }

    }

    @Override
    public boolean supports(Class<?> arg0) {
        return AgentDetailsVO.class.equals(arg0);
    }

}