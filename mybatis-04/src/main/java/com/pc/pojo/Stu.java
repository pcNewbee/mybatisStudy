package com.pc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pc
 * @date 2020/2/4 15:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stu {
    private int id;
    private String name;
    private String password;//属性名与数据库中的字段名不一致
}