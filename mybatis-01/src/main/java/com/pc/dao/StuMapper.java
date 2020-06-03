package com.pc.dao;

import com.pc.pojo.Stu;

import java.util.List;
import java.util.Map;

/**
 * @author pc
 * @date 2020/2/4 15:14
 */
public interface StuMapper {
    List<Stu> getStuList();
    Stu getStuByid(int id);
    //模糊查询
    List<Stu> getStuLike(String name);
    //万能的Map
    int addStu(Map<String,Object> map);
    int insertStu(Stu stu);
    int updateStu(Stu stu);
    int deleteStu(int id);
}
