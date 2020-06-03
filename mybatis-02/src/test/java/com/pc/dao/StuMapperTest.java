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
    public void testSelect(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一：getMapper
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        List<Stu> stuList = mapper.getStuList();

        //方式二：
        //List<Stu> stuList = sqlSession.selectList("com.pc.dao.StuMapper.getStuList");
        for(Stu stu:stuList){
            System.out.println(stu);
        }
        sqlSession.close();
    }
    @Test
    public void testSelectByid(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        Stu stuone = mapper.getStuByid(1);
        System.out.println(stuone);
        //sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testInsertStu(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        int ok = mapper.insertStu(new Stu(4, "insert", "123"));
        System.out.println(ok);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testUpdateStu(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        int updateOk = mapper.updateStu(new Stu(4, "update", "111"));
        System.out.println(updateOk);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testDeleteStu(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        int deleteOk = mapper.deleteStu(4);
        System.out.println(deleteOk);
        sqlSession.commit();
        sqlSession.close();
    }
}
