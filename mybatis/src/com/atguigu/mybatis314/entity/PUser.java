package com.atguigu.mybatis314.entity;

public class PUser {
    private int id;
    private String name;
    private String sex;

    @Override
    public String toString() {
        return "PUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public PUser() {

    }

    public PUser(int id, String name, String sex) {

        this.id = id;
        this.name = name;
        this.sex = sex;
    }
}
