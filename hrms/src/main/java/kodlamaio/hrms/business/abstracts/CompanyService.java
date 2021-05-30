package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.entities.concretes.Company;
import kodlamaio.hrms.entities.concretes.dtos.CompanyRegister;

public interface CompanyService {
	
	DataResult<List<Company>> getAll();
	Result add(Company company);
	
	DataResult<Company> getById(int id);

}
