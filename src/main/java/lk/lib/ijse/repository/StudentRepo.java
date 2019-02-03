package lk.lib.ijse.repository;

import lk.lib.ijse.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {
   @Query(value = "select * from Student s where s.reg_id= :id ",
           nativeQuery = true)
   List<Student> findByregd(@Param("id") Integer id);

   @Modifying
   @Transactional
    @Query(value = "delete  from Student  where reg_id= :id ",
    nativeQuery = true)
    void deleteByRegId(@Param("id") Integer id);
}
