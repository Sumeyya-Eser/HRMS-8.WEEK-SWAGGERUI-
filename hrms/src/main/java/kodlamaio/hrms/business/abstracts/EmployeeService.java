package kodlamaio.hrms.business.abstracts;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employee;
import kodlamaio.hrms.entities.concretes.dtos.EmployeesRegister;

import java.util.List;

public interface EmployeeService {
	DataResult<List<Employee>> getAll();
	Result register(EmployeesRegister employee);
	

}
