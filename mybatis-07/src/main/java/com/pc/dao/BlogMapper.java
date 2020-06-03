package com.pc.dao;

import com.pc.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author pc
 * @date 2020/2/6 16:07
 */
public interface BlogMapper {
    //新增一个博客
    int addBlog(Blog blog);
    //需求1
    List<Blog> queryBlogIf(Map map);
    List<Blog> queryBlogChoose(Map map);
    int updateBlog(Map map);
    List<Blog> queryBlogForeach(Map map);
}
