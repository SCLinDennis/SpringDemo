package com.codewithDennis;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import sun.management.FileSystem;

public class DrawingApp {

    public static void main(String[] args) {
	// write your code here
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Shape shape = (Shape) context.getBean("circle");
        shape.draw();
    }
}
