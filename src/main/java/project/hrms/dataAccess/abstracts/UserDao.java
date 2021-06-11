package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.core.utulities.DataResult;
import project.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer> {
    DataResult<User> getByEmail(String email);
}
