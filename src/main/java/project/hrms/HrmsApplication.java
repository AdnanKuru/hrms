package project.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import project.hrms.business.abstracts.JobPositionService;
import project.hrms.business.concretes.JobPositionManager;
import project.hrms.entities.concretes.JobPosition;

@SpringBootApplication
public class HrmsApplication {

	public static void main(String[] args) {

		SpringApplication.run(HrmsApplication.class, args);


	}



}
