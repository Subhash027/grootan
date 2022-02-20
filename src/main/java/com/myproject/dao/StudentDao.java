package com.myproject.dao;

import com.myproject.dto.StudentDto;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;


@Repository
public class StudentDao {
    static int id=01;

    private List<StudentDto> studentDtoList = new ArrayList<>();

    public StudentDao() {

        studentDtoList.add(StudentDto.builder().studentId("sd" + id++).studentname("subhash").age(21).sex("male").build());
        studentDtoList.add(StudentDto.builder().studentId("sd" + id++).studentname("rio").age(19).sex("male").build());
    }


    public List<StudentDto> getStudent() {
        return studentDtoList;
    }

    public void addStudent(StudentDto studentDto) {

        studentDto.setStudentId("sd"+(id++));
        studentDtoList.add(studentDto);

    }
}
