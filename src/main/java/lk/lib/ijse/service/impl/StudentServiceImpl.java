package lk.lib.ijse.service.impl;

import lk.lib.ijse.dto.StudentDTO;
import lk.lib.ijse.model.Student;
import lk.lib.ijse.repository.StudentRepo;
import lk.lib.ijse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;


    @Override
    public void addStudent(StudentDTO studentDTO) {
        Student student=new Student(studentDTO.getSid(),studentDTO.getRegId(),studentDTO.getName(),
                studentDTO.getAddress(),studentDTO.getBday(),studentDTO.getGrade(),studentDTO.getPassword());
        System.out.println(student.getRegId());
        studentRepo.save(student);
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<StudentDTO> list=new ArrayList<>();
        List<Student> allCus= studentRepo.findAll();
        for (Student c : allCus){
            list.add(new StudentDTO(c.getRegId(),c.getName(),c.getAddress(),c.getBday(),c.getGrade(),c.getPassword()));

        }
        return list;
    }

    @Override
    public void updateStudent(StudentDTO studentDTO) {
        String msg=null;
        List<Student> students=studentRepo.findByregd(studentDTO.getRegId());

        Student student=new Student(students.get(0).getSid(),studentDTO.getRegId(),studentDTO.getName(),
                studentDTO.getAddress(),studentDTO.getBday(),studentDTO.getGrade(),studentDTO.getPassword());
        System.out.println(student.getSid());
       if (student != null){
           studentRepo.save(student);
       }

    }

    @Override
    public List<Student> searchStudent(Integer id) {
        List<Student> students=studentRepo.findByregd(id);
        return students;
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepo.deleteByRegId(id);
    }
}
