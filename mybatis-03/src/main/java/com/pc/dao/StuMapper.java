package com.pc.dao;

import com.pc.pojo.Stu;

import java.util.List;
import java.util.Map;

/**
 * @author pc
 * @date 2020/2/4 15:14
 */
public interface StuMapper {
    Stu getStuById(int id);
    List<Stu> getStuByLimit(Map<String, Integer> map);
    List<Stu> getStuByRowBounds();
}
