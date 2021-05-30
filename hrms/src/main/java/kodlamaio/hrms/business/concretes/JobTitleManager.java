package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;


@Service //business görevi görecek demek
public class JobTitleManager implements JobTitleService{

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<>(jobTitleDao.findAll()," Data was listed");
	}

	@Override
	public Result add(JobTitle jobTitle) {
		if(!jobTitleDao.existsByTitle(jobTitle.getTitle())) {
			this.jobTitleDao.save(jobTitle);
			return new SuccessResult("Job Title was added");
		}
		else return new ErrorResult("Job title is already exist in system");
	}

	@Override
	public JobTitle getByTitle(String title) {
		return this.jobTitleDao.findByTitle(title);
	}

	@Override
	public DataResult<JobTitle> getById(int id) {
		JobTitle jobTitle = jobTitleDao.findById(id);
		if(jobTitle==null) return new ErrorDataResult<JobTitle>();
	    return new SuccessDataResult<JobTitle>(jobTitle);
	}



}
