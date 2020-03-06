package com.team.students.controller;

import com.team.students.entity.Students;
import com.team.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController   //Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getStudentData")
    @ResponseBody
    public  List<Students>   getStudentData(){
        //调用业务
        List<Students> list=studentService.getStudents();
        return list;
        //返回java对象，而且还要转化为json
    }

}
