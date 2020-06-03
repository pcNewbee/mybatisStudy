package com.pc.dao;

import com.pc.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author pc
 * @date 2020/2/6 13:19
 */
public interface TeacherMapper {
    @Select("select * from mybatis.teacher where id=#{tid}")
    Teacher getTeaById(@Param("tid") int id);
}
