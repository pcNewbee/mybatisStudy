package com.pc.dao;

import com.pc.pojo.Stu;
import com.pc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author pc
 * @date 2020/2/4 15:27
 */
public class StuMapperTest {
    @Test
    public void testSelectAll(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        List<Stu> stus = mapper.SelectAll();
        for (Stu stu : stus) {
            System.out.println(stu);
        }
        //sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testgetStuById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        Stu stu = mapper.getStuById(1);
        System.out.println(stu);
        //sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testaddStu(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        int i = mapper.addStu(new Stu(7, "注解", "test"));
        System.out.println(i);
        //sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testDeleteStu(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        int num = mapper.deleteStu(7);
        System.out.println(num);
        //sqlSession.commit();
        sqlSession.close();
    }
}
