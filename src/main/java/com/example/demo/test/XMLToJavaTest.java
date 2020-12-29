package com.example.demo.test;

import com.example.demo.jaxb.pojo.GradeClass;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * @author wanghui
 * @date 2020/12/29
 * Description:xml转化为java对象
 */
public class XMLToJavaTest {
    /**
     * xml转化为java对象
     */
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(GradeClass.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            File xMLFile = new File("D:\\Jaxb.xml");
            //解组
            GradeClass gradeClass = (GradeClass) jaxbUnmarshaller.unmarshal(xMLFile);
            System.out.println("gradeClass.getClassName: " + gradeClass.getClassName());
            System.out.println(gradeClass.toString());
        } catch (JAXBException e) {
            // some exception occured
            e.printStackTrace();
        }
    }
}
