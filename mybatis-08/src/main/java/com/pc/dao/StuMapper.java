package com.pc.dao;

import com.pc.pojo.Stu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author pc
 * @date 2020/2/4 15:14
 */
public interface StuMapper {
    List<Stu> getStuList();
    //根据id查询用户
    Stu queryStuById(@Param("id") int id);
}
