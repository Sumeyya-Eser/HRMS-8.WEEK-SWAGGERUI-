package kodlamaio.hrms.entities.concretes.dtos;

import java.util.Date;

public class EmployeesRegister {
	
	private String firstName;
	private String lastName;
	private String idNo;
	private Date birthDate;
	private String email;
	private String password;
	private String verifyPassword;
	public EmployeesRegister(String firstName, String lastName, String idNo, Date birthDate, String email,
			String password, String verifyPassword) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNo = idNo;
		this.birthDate = birthDate;
		this.email = email;
		this.password = password;
		this.verifyPassword = verifyPassword;
	}
	public EmployeesRegister() {
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVerifyPassword() {
		return verifyPassword;
	}
	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}
	
	

}
