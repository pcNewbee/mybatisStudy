package com.pc.dao;

import com.pc.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @author pc
 * @date 2020/2/6 13:19
 */
public interface TeacherMapper {
    //获取指定老师，及老师下的所有学生
    Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(@Param("id") int id);
}
