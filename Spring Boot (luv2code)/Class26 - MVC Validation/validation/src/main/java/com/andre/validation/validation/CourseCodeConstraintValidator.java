package com.andre.validation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode courseCode) {
        coursePrefix = courseCode.value();
    }

    @Override
    public boolean isValid(String inputForm, ConstraintValidatorContext constraintValidatorContext) {
        if(inputForm == null) return false;
        return inputForm.startsWith(coursePrefix);
    }
}
