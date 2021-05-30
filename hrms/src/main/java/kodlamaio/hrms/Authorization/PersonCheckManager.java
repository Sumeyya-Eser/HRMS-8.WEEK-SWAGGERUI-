package kodlamaio.hrms.Authorization;

import java.util.Date;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.User;

@Service
public class PersonCheckManager implements PersonCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean validateUser(String string, String string2, String string3, Date date) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
