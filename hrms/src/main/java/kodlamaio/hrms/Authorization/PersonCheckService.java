package kodlamaio.hrms.Authorization;

import java.util.Date;

import kodlamaio.hrms.entities.concretes.User;

public interface PersonCheckService {

	 boolean CheckIfRealPerson(User user);
	 
	 boolean validateUser(String string, String string2, String string3, Date date);
}
