package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CompanyService;
import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.concretes.dtos.JobAdvertForAdd;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {


	private JobAdvertisementDao jobAdvertisementDao;
	private CompanyService companyService;
	private JobTitleService jobTitleService;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao, CompanyService companyService,
			JobTitleService jobTitleService) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
		this.companyService = companyService;
		this.jobTitleService = jobTitleService;
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveTrue() {
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findByIsActiveTrue());
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveTrueOrderByCreateDate() {
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findByIsActiveTrueOrderByCreateDate());
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByCompany_Id(int id) {
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findByIsActiveTrueAndCompany_Id(id));
	}

	@Override
	public Result addJob(JobAdvertForAdd jobAdvertisement) {
		//Geçici olarak oluşturuldu
		return new SuccessResult("İş ilanı başarı ile oluşturuldu.");
	}

}
