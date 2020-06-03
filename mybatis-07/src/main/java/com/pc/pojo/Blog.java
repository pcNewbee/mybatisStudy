package com.pc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author pc
 * @date 2020/2/6 16:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog  {
    private String  id;
    private String title;
    private String author;
    private Date createTime;//与数据库字段不一致
    private int views;
}