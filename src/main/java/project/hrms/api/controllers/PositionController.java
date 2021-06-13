package project.hrms.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.PositionService;
import project.hrms.core.utulities.DataResult;
import project.hrms.entities.concretes.Position;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
public class PositionController {

    private PositionService positionService;

    @Autowired
    public PositionController(PositionService positionService) {
        super();
        this.positionService = positionService;
    }

    @GetMapping("/getAllpositions")
    public DataResult<List<Position>> getAll(){
        return this.positionService.findAll();
    }

}
