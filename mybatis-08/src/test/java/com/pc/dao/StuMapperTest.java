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
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        List<Stu> stuList = mapper.getStuList();
        for(Stu stu:stuList){
            System.out.println(stu);
        }
        sqlSession.close();
    }
    @Test
    public void testQueryStuById(){
        SqlSession session = MybatisUtils.getSqlSession();
        StuMapper mapper = session.getMapper(StuMapper.class);

        Stu stu = mapper.queryStuById(1);
        System.out.println(stu);
        session.clearCache(); //手动清理缓存
        Stu stu2 = mapper.queryStuById(1);
        System.out.println(stu2);
        System.out.println(stu==stu2);

        session.close();
    }
    @Test
    public void testQueryUserById(){
        SqlSession session = MybatisUtils.getSqlSession();
        SqlSession session2 = MybatisUtils.getSqlSession();

        StuMapper mapper = session.getMapper(StuMapper.class);
        StuMapper mapper2= session2.getMapper(StuMapper.class);

        Stu stu = mapper.queryStuById(1);
        System.out.println(stu);
        session.close();

        Stu stu2 = mapper2.queryStuById(1);
        System.out.println(stu2);
        System.out.println(stu==stu2);

        session2.close();
    }
}
