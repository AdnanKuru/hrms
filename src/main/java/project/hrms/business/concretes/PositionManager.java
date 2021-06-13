package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.PositionService;
import project.hrms.core.utulities.DataResult;
import project.hrms.core.utulities.SuccessDataResult;
import project.hrms.dataAccess.abstracts.PositionDao;
import project.hrms.entities.concretes.Position;

import java.util.List;

@Service
public class PositionManager implements PositionService {

    private PositionDao positionDao;

    @Autowired
    public PositionManager(PositionDao positionDao) {
        super();
        this.positionDao = positionDao;
    }

    @Override
    public DataResult<List<Position>> findAll(){
        return new SuccessDataResult<List<Position>>(this.positionDao.findAll());
    }
}
