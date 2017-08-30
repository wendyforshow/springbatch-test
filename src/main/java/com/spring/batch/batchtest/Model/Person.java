package com.spring.batch.batchtest.Model;

import java.io.Serializable;

/**
 * 项目：fs-fubei-shop
 * 包名：com.spring.batch.batchtest.Model
 * 功能：
 * 时间：2017/8/22
 * 作者：PGG
 */
public class Person implements Serializable{
    private String id;
    private String name;
    private Integer age;
    private String nation;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
