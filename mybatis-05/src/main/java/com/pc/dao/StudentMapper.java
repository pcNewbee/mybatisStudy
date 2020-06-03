package com.pc.dao;

import com.pc.pojo.Student;

import java.util.List;

/**
 * @author pc
 * @date 2020/2/6 13:19
 */
public interface StudentMapper {
    public List<Student> getStudent();
    public List<Student> getStudents2();
}
