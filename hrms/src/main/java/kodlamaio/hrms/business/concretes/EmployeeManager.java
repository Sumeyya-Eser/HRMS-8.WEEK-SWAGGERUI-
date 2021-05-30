package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Authorization.PersonCheckService;
import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Candidates;
import kodlamaio.hrms.entities.concretes.Employee;
import kodlamaio.hrms.entities.concretes.User;
import kodlamaio.hrms.entities.concretes.dtos.CompanyRegister;
import kodlamaio.hrms.entities.concretes.dtos.EmployeesRegister;
@Service
public class EmployeeManager implements EmployeeService{
	
	private EmployeeDao employeeDao;
	private UserService userService;
	private PersonCheckService personCheckService;
	
	
    @Autowired
	public EmployeeManager(EmployeeDao employeeDao, UserService userService, PersonCheckService personCheckService) {
		super();
		this.employeeDao = employeeDao;
		this.userService = userService;
		this.personCheckService = personCheckService;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(employeeDao.findAll());
	}

	@Override
	public Result register(EmployeesRegister employee) {
		if (employee.getBirthDate() != null && employee.getEmail() != null && employee.getIdNo() != null
				 && employee.getFirstName() != null && employee.getLastName()!= null) {
	            return new SuccessDataResult("The Employee registration is successfull. Please check your email for verification ");	 
	           
  
	}
		else {
			return new ErrorDataResult("The registiration is not successfull. Try Again.");
		}
		}
	private Result isPasswordsMatch(EmployeesRegister employee) {
		if(!employee.getPassword().equals(employee.getVerifyPassword())) {
			return new ErrorResult("The passwords are not matched.");
		}
		return null;
	}
	
	private Result isUserExistWithEmail(EmployeesRegister employee) {
		if(userService.getByEmail(employee.getEmail()).getData() != null)
			return new ErrorResult("This e mail is already using in system");
		return null;
	}
	
}

