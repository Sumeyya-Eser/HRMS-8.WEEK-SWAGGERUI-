package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="job_advertisement")
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="jobDescription")
	private String jobDescription;
	
	@Column(name="minPayment")
	private double minPayment;
	
	@Column(name="maxPayment")
	private double maxPayment;
	
	@Column(name="openPositionNumber")
	private int openPositionNumber;
	
	@Column(name="lastApplyDate")
	private Date lastApplyDate;
	
	@Column(name="isActive")
	private boolean isActive;
	
	@Column(name="createDate")
	private Date createDate;
	
	@ManyToOne()
	@JoinColumn(name="id")
	private City city;
	
	@ManyToOne()
	@JoinColumn(name="id")
	private Company company;

	@ManyToOne
	@JoinColumn(name="job_title")
	private JobTitle jobTitle;

	
	public JobAdvertisement(int id, String jobDescription, double minPayment, double maxPayment, int openPositionNumber,
			Date lastApplyDate, boolean isActive, Date createDate, City city, Company company) {
		super();
		this.id = id;
		this.jobDescription = jobDescription;
		this.minPayment = minPayment;
		this.maxPayment = maxPayment;
		this.openPositionNumber = openPositionNumber;
		this.lastApplyDate = lastApplyDate;
		this.isActive = isActive;
		this.createDate = createDate;
		this.city = city;
		this.company = company;
	}
	public JobAdvertisement() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getOpenPositionNumber() {
		return openPositionNumber;
	}
	public void setOpenPositionNumber(int openPositionNumber) {
		this.openPositionNumber = openPositionNumber;
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
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	
}
