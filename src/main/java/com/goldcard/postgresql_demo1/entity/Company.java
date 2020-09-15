package com.goldcard.postgresql_demo1.entity;

import lombok.Data;

/**
 * @description:
 * @author: 1933
 * @createDate: 2020/9/14 7:44 PM
 * @version: 1.0
 */
@Data
public class Company {
    private  long id;

    private String name;

    private int age;

    private String address;

    private double salary;

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
