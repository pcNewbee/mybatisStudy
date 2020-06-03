package com.pc.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author pc
 * @date 2020/2/6 16:12
 */
@SuppressWarnings("all") //抑制拼写命名不规范警告
public class IDUtil {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
        System.out.println(IDUtil.getId());
    }
}
