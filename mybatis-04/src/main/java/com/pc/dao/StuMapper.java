package com.pc.dao;

import com.pc.pojo.Stu;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author pc
 * @date 2020/2/4 15:14
 */
public interface StuMapper {
    @Select("select * from mybatis.stu")
    List<Stu> SelectAll();

    //多个参数时每个参数都要使用一个@Param
    @Select("select * from mybatis.stu where id=#{id}")
    Stu getStuById(@Param("id") int id);

    //引用对象Stu不需要使用@Param
    @Insert("insert into mybatis.stu(id,name,pwd) values(#{id}, #{name},#{password})")
    int addStu(Stu stu);

    @Delete("delete from mybatis.stu where id=#{uid}")
    int deleteStu(@Param("uid") int id);
}
