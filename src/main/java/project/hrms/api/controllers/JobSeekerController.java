package project.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.PositionService;
import project.hrms.business.abstracts.JobSeekerService;
import project.hrms.core.utulities.DataResult;
import project.hrms.entities.concretes.Position;
import project.hrms.entities.concretes.JobSeeker;

import java.util.List;

@RestController
@RequestMapping("/api/jobSeekers")
public class JobSeekerController {

    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekerController(JobSeekerService jobSeekerService) {
        super();
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("/getAllJobSeekers")
    public DataResult<List<JobSeeker>> getAll(){
        return this.jobSeekerService.getAll();
    }
}
