package com.example.demo.jaxb.pojo;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author wanghui
 * @date 2020/12/29
 * Description: 年级实体
 */
@XmlRootElement(name = "gradeClass")
@XmlType(propOrder = {"className", "teachers"})
public class GradeClass {
    @XmlElement
    private String className;
    @XmlElement
    @XmlElementWrapper(name = "teacherList")
    private List<Teacher> teachers;

    @XmlTransient
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @XmlTransient
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
