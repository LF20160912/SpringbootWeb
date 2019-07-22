package com.mike.bootweb.bootjdbc.domain;

/*
+----+------+------+---------+
| id | name | age  | address |
+----+------+------+---------+
|  1 | Mike |   29 | 北京    |
|  2 | 王泽  |   29 | 北京    |
+----+------+------+---------+
* */
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address +
                "'}";
    }
}
