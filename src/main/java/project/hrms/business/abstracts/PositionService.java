package project.hrms.business.abstracts;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import project.hrms.core.utulities.DataResult;
import project.hrms.entities.concretes.Position;


import java.util.List;


public interface PositionService {

    DataResult<List<Position>> findAll();
}
