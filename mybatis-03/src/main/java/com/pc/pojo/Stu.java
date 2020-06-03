package com.pc.pojo;

/**
 * @author pc
 * @date 2020/2/4 15:03
 */
public class Stu {
    private int id;
    private String name;
    private String password;//属性名与数据库中的字段名不一致

    public Stu() {
    }

    public Stu(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}