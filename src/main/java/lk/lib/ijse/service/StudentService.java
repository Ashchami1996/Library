package lk.lib.ijse.service;

import lk.lib.ijse.dto.StudentDTO;
import lk.lib.ijse.model.Student;

import java.util.List;

public interface StudentService {
    void addStudent(StudentDTO studentDTO);

    List<StudentDTO> getAllStudents();

    void updateStudent(StudentDTO studentDTO);

    List<Student> searchStudent(Integer id);

    void deleteStudent(Integer id);
}
