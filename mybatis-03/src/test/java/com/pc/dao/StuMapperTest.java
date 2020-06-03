package com.pc.dao;

import com.pc.pojo.Stu;
import com.pc.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author pc
 * @date 2020/2/4 15:27
 */
public class StuMapperTest {
        static Logger logger=Logger.getLogger(StuMapperTest.class);

    @Test
    public void testSelectByid(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        Stu stuone = mapper.getStuById(1);
        System.out.println(stuone);
        //sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testLog4j(){
        logger.info("info:enter log4j");
        logger.debug("debug: enter debug");
        logger.error("error: enter error");
    }
    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);

        List<Stu> stusByLimit = mapper.getStuByLimit(map);
        for (Stu stu : stusByLimit) {
            System.out.println(stu);
        }
        sqlSession.close();
    }
    @Test
    public void getStuByRowBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RowBounds rowBounds = new RowBounds(1, 2);
        List<Stu> stus = sqlSession.selectList("com.pc.dao.StuMapper.getStuByRowBounds",null, rowBounds);
        for (Stu stu : stus) {
            System.out.println(stu);
        }
        sqlSession.close();
    }
}
