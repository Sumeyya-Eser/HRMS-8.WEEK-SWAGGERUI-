package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Authorization.AdminAuthService;
import kodlamaio.hrms.business.abstracts.AdminService;
import kodlamaio.hrms.business.abstracts.CompanyService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.CompanyDao;
import kodlamaio.hrms.entities.concretes.Company;
import kodlamaio.hrms.entities.concretes.dtos.CompanyRegister;

@Service
public class CompanyManager implements CompanyService{
	
	
	private CompanyDao companyDao;
	private AdminService adminService;
	private AdminAuthService adminAuthService;

	 @Autowired
	public CompanyManager(CompanyDao companyDao, AdminService adminService, AdminAuthService adminAuthService) {
		super();
		this.companyDao = companyDao;
		this.adminService = adminService;
		this.adminAuthService = adminAuthService;
	}



	@Override
	public DataResult<List<Company>> getAll() {
		return new SuccessDataResult<>(companyDao.findAll(),"Data was listed");
	}



	public Result add(Company company) {
	if(company.getCompanyName() != null&& company.getPasswordRepeat() != null
			&& company.getPhoneNumber() != null && company.getWebAdress()!=null && 
			company.getPassword()!=null && company.getEmail()!=null && company.getPasswordRepeat()!=null) 
	{
		if(company.getPassword().equals(company.getPasswordRepeat())) {
			Pattern mailPatern = Pattern.compile("[a-z A-Z 0-9]+@[a-z A-Z 0-9]+\\.[a-z A-Z 0-9]+$");
            Matcher mailmatcher = mailPatern.matcher(company.getEmail());
            if (mailmatcher.matches()) {
                String[] domainsWebsite = company.getWebAdress().split("[.]+");
                String[] domainsMail = company.getEmail().split("[.]+");
                if (domainsMail[domainsMail.length - 1].equals(domainsWebsite[domainsWebsite.length - 1])) {
                	if(!companyDao.existsByEmail((company.getEmail()))) {
                		
                		try {

                            companyDao.save(company);
                            return new SuccessResult(adminAuthService.adminCheckUser(company)+
                            		adminService.verifyCompany(company).getMessage()+", Employers was Added");
                            		
                		}catch (Exception e) {
                            return new ErrorResult("VALIDATION FAILED, TRY AGAIN");
                        }
                		

                     } else
                         return new ErrorResult("EMAIL ALREADY IS USED IN SYSTEM ");
                 } else return new ErrorResult("The domain name of the email and the website must be the same ");

             } else
                 return new ErrorResult("INVALID EMAIL FORMAT");
         } else
             return new ErrorResult("INVALID PASSWORD ");
     } else
         return new ErrorResult("PLEASE FILL EVERY FIELD");
	
	}



	@Override
	public DataResult<Company> getById(int id) {
       Company company= companyDao.getOne(id);
       if(company==null) return new ErrorDataResult<Company>();
       return new SuccessDataResult<Company>(company);

	}

	}
	
	
