package lk.lib.ijse.controller;

import lk.lib.ijse.dto.StudentDTO;
import lk.lib.ijse.model.Student;
import lk.lib.ijse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Student")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public void addStudent(@RequestBody StudentDTO studentDTO){
        System.out.println(studentDTO.getRegId());
        studentService.addStudent(studentDTO);

    }

    @GetMapping("/all")
    public List<StudentDTO> getAll(){
        return studentService.getAllStudents();
    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody StudentDTO studentDTO){

        studentService.updateStudent(studentDTO);
    }

    @GetMapping("/find/{id}")
    public List<Student> searchStudent(@PathVariable Integer id){

        return studentService.searchStudent(id);

    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }



}
