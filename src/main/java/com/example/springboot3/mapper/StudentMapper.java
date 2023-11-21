package com.example.springboot3.mapper;

import com.example.springboot3.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

// 表示本类是Mybatis的mapper类
@Mapper
@Repository
public interface StudentMapper {

    List<Student> queryStudentList();

    Student queryStudentById(int id);

    int addStudent(Student student);

    int updateStudent(Student student);

    int deleteStudent(int id);

}
