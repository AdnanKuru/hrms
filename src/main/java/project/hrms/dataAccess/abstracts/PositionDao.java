package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.Position;

import java.util.List;

public interface PositionDao extends JpaRepository<Position,Integer> {
   List<Position> findAll();
   //Position getByJobName();

}
