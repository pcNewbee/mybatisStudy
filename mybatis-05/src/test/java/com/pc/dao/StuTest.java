package com.pc.dao;

import com.pc.pojo.Student;
import com.pc.pojo.Teacher;
import com.pc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author pc
 * @date 2020/2/6 13:50
 */
public class StuTest {
    @Test
    public void getTeaByIdTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teaById = mapper.getTeaById(1);
        System.out.println(teaById);
        //sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void getStuTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent();
        for (Student student : students) {
            System.out.println(student);
        }
        //sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void getStuTest2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents2();
        for (Student student : students) {
            System.out.println(student);
        }
        //sqlSession.commit();
        sqlSession.close();
    }
}
