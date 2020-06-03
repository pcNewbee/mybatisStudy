package com.pc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author pc
 * @date 2020/2/4 15:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//不加策略时需要实现序列化
public class Stu implements Serializable {
    private int id;
    private String name;
    private String pwd;
}
