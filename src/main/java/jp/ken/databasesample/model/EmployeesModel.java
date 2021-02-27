package jp.ken.databasesample.model;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class EmployeesModel implements Serializable {

	private String employee_id;
	
	@NotEmpty(groups=ErrorCheckGroup1.class, message="名前を省略することはできません")
	private String employee_name;
	
	@Pattern(regexp="^(070|080|090)-\\d{4}-\\d{4}$", groups=ErrorCheckGroup1.class, message="携帯番号ではありません")
	private String employee_phone;
	
	@NotEmpty(groups=ErrorCheckGroup1.class, message="メールアドレスを省略することはできません")
	@Email(groups=ErrorCheckGroup1.class, message="メールアドレスではありません")
	private String employee_email;
	private int department_id;
	
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_phone() {
		return employee_phone;
	}
	public void setEmployee_phone(String employee_phone) {
		this.employee_phone = employee_phone;
	}
	public String getEmployee_email() {
		return employee_email;
	}
	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
}
