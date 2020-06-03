package com.pc.dao;

import com.pc.pojo.Teacher;
import com.pc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author pc
 * @date 2020/2/6 13:50
 */
public class StuTest {
    @Test
    public void getTeaByIdTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teaById = mapper.getTeacher(1);
        System.out.println(teaById);
        //sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testGetTeacher2(){
        SqlSession session = MybatisUtils.getSqlSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher2(1);
        System.out.println(teacher.getName());
        System.out.println(teacher.getStudents());
    }
}
