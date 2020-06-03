package com.pc.dao;

import com.pc.pojo.Stu;

import java.util.List;

/**
 * @author pc
 * @date 2020/2/4 15:14
 */
public interface StuMapper {
    List<Stu> getStuList();
    Stu getStuByid(int id);
    int insertStu(Stu stu);
    int updateStu(Stu stu);
    int deleteStu(int id);
}
