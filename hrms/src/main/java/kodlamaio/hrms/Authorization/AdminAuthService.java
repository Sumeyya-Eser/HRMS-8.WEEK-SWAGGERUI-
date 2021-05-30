package kodlamaio.hrms.Authorization;

import kodlamaio.hrms.entities.concretes.User;

public interface AdminAuthService {
	boolean adminCheckUser(User user);

}
