package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.concretes.*;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer>{

	List<JobAdvertisement> findByIsActiveTrue();
    List<JobAdvertisement> findByIsActiveTrueOrderByCreateDate();
	List<JobAdvertisement> findByIsActiveTrueAndCompany_Id(int id);
	//JobAdvertisement findByIdAndCompany_Id(int id);
	
}