package kodlamaio.hrms.entities.concretes.dtos;

public class CompanyRegister {
	private String companyName;
	private String phone;
	private String website;
	private String email;
	private String password;
	private String verifyPassword;
	public CompanyRegister(String companyName, String phone, String website, String email, String password,
			String verifyPassword) {
		super();
		this.companyName = companyName;
		this.phone = phone;
		this.website = website;
		this.email = email;
		this.password = password;
		this.verifyPassword = verifyPassword;
	}
	public CompanyRegister() {
		
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
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
