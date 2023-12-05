package com.byconstructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class TestMain {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("NewFile.xml");
		BeanFactory beanfactory = new XmlBeanFactory(resource);
		Students students = (Students) beanfactory.getBean("Bean");
		System.out.println(students);
	}

}
