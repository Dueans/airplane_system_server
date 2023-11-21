package com.example.springboot3.controller;

import com.example.springboot3.mapper.StudentMapper;
import com.example.springboot3.pojo.Student;
import com.example.springboot3.vo.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("studentList")
    public ActionResult queryStudentList(){
        ActionResult actionResult = new ActionResult();
        List<Student> studentList = studentMapper.queryStudentList();
        actionResult.setStatusCode(200);
        actionResult.setData(studentList);
        return actionResult;
    }


}
