package com.myproject.Controller;

import com.myproject.dao.StudentDao;
import com.myproject.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private final StudentDao studentDao;

    public StudentController(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @GetMapping
    public List<StudentDto> getstudent()
    {
        return studentDao.getStudent();
    }

    @PostMapping
    public void addstudent(@RequestBody StudentDto studentDto)
    {
        studentDao.addStudent(studentDto);
    }



}
