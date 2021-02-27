package jp.ken.databasesample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import jp.ken.databasesample.model.EmployeesModel;

@Component
public class ConditionsCheckValidator implements Validator {

	@Autowired
	private Validator validator;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return EmployeesModel.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.invokeValidator(validator, target, errors);
		EmployeesModel eModel = (EmployeesModel)target;
		String id = eModel.getEmployee_id();
		String name = eModel.getEmployee_name();
		if(id != null && name != null && !id.equals("") && !name.equals("")){
			errors.rejectValue("employee_id", "ConditionsCheckValidator.employeesModel.employee_id", "入力する場合は、IDか名前のどちらかに入力してください。");
		}
		if(id != null && !id.equals("")){
			if(!id.matches("[0-9]+")){
				errors.rejectValue("employee_id", "ConditionsCheckValidator.employeesModel.employee_id", "IDを入力する場合は、数値を入力してください。");
			}
		}
	}
}
