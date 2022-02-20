package com.myproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor

public class StudentDto {

    private String studentId;
    private String studentname;
    private Integer age;
    private String sex;


}


