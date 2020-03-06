package com.team.students.service.impl;

import com.team.students.entity.Students;
import com.team.students.entity.StudentsExample;
import com.team.students.mapper.StudentsMapper;
import com.team.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServicImpl implements StudentService {

    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public List<Students> getStudents() {
        return studentsMapper.selectByExample(new StudentsExample());
    }
}
