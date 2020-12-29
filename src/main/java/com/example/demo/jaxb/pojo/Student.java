package com.example.demo.jaxb.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author wanghui
 * @date 2020/12/29
 * Description:学生实体
 */
public class Student {
    /**
     * 编号
     */
    @XmlElement(name = "id")
    private String id;
    /**
     * 名称
     */
    @XmlElement(name = "studentName")
    private String name;
    /**
     * 年级
     */
    @XmlElement(name = "age")
    private String age;
    @XmlTransient
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @XmlTransient
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlTransient
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
