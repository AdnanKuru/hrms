package project.hrms.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.JobPositionService;
import project.hrms.entities.concretes.JobPosition;

import java.util.List;

@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionController {

    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionController(JobPositionService jobPositionService) {
        super();
        this.jobPositionService = jobPositionService;
    }

    @GetMapping("/getall")
    public List<JobPosition> getAll(){
        return this.jobPositionService.getAll();
    }

}
