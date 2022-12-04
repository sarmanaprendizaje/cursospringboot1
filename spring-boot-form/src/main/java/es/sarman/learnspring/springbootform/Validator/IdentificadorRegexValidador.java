package es.sarman.learnspring.springbootform.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdentificadorRegexValidador implements ConstraintValidator<IdentificadorRegex, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value.matches("[0-9]{2}[.][\\d]{3}[.][\\d]{3}[-][A-Z]{1}");
	}

}
