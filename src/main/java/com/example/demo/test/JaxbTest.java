package com.example.demo.test;

import com.example.demo.jaxb.pojo.GradeClass;
import com.example.demo.jaxb.pojo.Student;
import com.example.demo.jaxb.pojo.Teacher;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

/**
 * @author wanghui
 * @date 2020/12/29
 * Description: 测试
 */
public class JaxbTest {
    /**
     * java对象转化为xml
     *
     * @param args 参数
     */
    public static void main(String[] args) {

        Student student = new Student();
        student.setId("1");
        student.setAge("11");
        student.setName("小明");
        Student student2 = new Student();
        student2.setId("2");
        student2.setAge("12");
        student2.setName("小红");
        Student student3 = new Student();
        student3.setId("3");
        student3.setAge("13");
        student3.setName("小王");
        Student student4 = new Student();
        student4.setId("4");
        student4.setAge("14");
        student4.setName("小刘");
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);

        Teacher teacher = new Teacher();
        teacher.setName("小李老师");
        teacher.setAge("18");
        teacher.setStudents(studentArrayList);
        Teacher teacher2 = new Teacher();
        teacher2.setName("小赵老师");
        teacher2.setAge("88");
        teacher2.setStudents(null);
        ArrayList<Teacher> teacherArrayList = new ArrayList<>();
        teacherArrayList.add(teacher);
        teacherArrayList.add(teacher2);

        GradeClass gradeClass = new GradeClass();
        gradeClass.setClassName("一年级");
        gradeClass.setTeachers(teacherArrayList);

        try {
            //创建JAXB上下文
            JAXBContext jaxbContext = JAXBContext.newInstance(GradeClass.class);
            //创建编组对象
            Marshaller marshaller = jaxbContext.createMarshaller();
            //XML格式
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File xMLFile = new File("D:\\Jaxb.xml");
            //编组
            marshaller.marshal(gradeClass, xMLFile);
            //控制台输出
            marshaller.marshal(gradeClass, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
