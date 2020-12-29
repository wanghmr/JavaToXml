package com.example.demo.jaxb.pojo;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author wanghui
 * @date 2020/12/29
 * Description: 老师实体
 */
@XmlRootElement(namespace = "org.arpit.javapostsforlearning.jaxb.Country")
@XmlType(propOrder = {"name", "age","students"})
public class Teacher {
    @XmlElementWrapper(name = "studentList")
    @XmlElement(name = "students")
    private List<Student> students;
    /**
     * 名称
     */
    @XmlElement(name = "teacherName")
    private String name;
    /**
     * 年级
     */
    @XmlElement(name = "teacherAge")
    private String age;

    @XmlTransient
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @XmlTransient
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    @XmlTransient
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
