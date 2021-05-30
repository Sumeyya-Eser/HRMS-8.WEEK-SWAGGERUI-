package kodlamaio.hrms.entities.concretes.dtos;

import java.util.Date;

public class JobAdvertForAdd {
	
	private String jobDescription;
	private double minPayment;
	private double maxPayment;
	private int openPositionAmount;
	private Date lastApplyDate;
	private boolean isActive;
	private int cityId;
	private int jobPositionId;
	private int companyId;
	public JobAdvertForAdd(String jobDescription, double minPayment, double maxPayment, int openPositionAmount,
			Date lastApplyDate, boolean isActive, int cityId, int jobPositionId, int companyId) {
		super();
		this.jobDescription = jobDescription;
		this.minPayment = minPayment;
		this.maxPayment = maxPayment;
		this.openPositionAmount = openPositionAmount;
		this.lastApplyDate = lastApplyDate;
		this.isActive = isActive;
		this.cityId = cityId;
		this.jobPositionId = jobPositionId;
		this.companyId = companyId;
	}
	public JobAdvertForAdd() {
		
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public double getMinPayment() {
		return minPayment;
	}
	public void setMinPayment(double minPayment) {
		this.minPayment = minPayment;
	}
	public double getMaxPayment() {
		return maxPayment;
	}
	public void setMaxPayment(double maxPayment) {
		this.maxPayment = maxPayment;
	}
	public int getOpenPositionAmount() {
		return openPositionAmount;
	}
	public void setOpenPositionAmount(int openPositionAmount) {
		this.openPositionAmount = openPositionAmount;
	}
	public Date getLastApplyDate() {
		return lastApplyDate;
	}
	public void setLastApplyDate(Date lastApplyDate) {
		this.lastApplyDate = lastApplyDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getJobPositionId() {
		return jobPositionId;
	}
	public void setJobPositionId(int jobPositionId) {
		this.jobPositionId = jobPositionId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	

}
