package kodlamaio.hrms.business.abstracts;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.concretes.dtos.JobAdvertForAdd;

import java.util.List;
public interface JobAdvertisementService {
	
	DataResult<List<JobAdvertisement>> findByIsActiveTrue();
	DataResult<List<JobAdvertisement>> findByIsActiveTrueOrderByCreateDate();
	DataResult<List<JobAdvertisement>> findByCompany_Id(int id);
	
	Result addJob(JobAdvertForAdd jobAdvertisement);
	

}
