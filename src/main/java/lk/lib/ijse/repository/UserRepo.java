package lk.lib.ijse.repository;

import lk.lib.ijse.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer>{
}
