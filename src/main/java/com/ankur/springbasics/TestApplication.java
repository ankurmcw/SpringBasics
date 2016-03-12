package com.ankur.springbasics;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ankur.springbasics.impl.Rhombus;
import com.ankur.springbasics.interfaces.Shape;

public class TestApplication {

	public static void main(String[] args) {
		
		/*BeanFactory factory = new XmlBeanFactory(new FileSystemResource("bean-config.xml"));
		Shape shape = (Shape) factory.getBean("triangle");
		shape.draw();*/
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
		context.registerShutdownHook();
		
		Shape triangle = (Shape) context.getBean("triangle");
		triangle.draw();
		
		Shape square = (Shape) context.getBean("square");
		square.draw();
		
		Shape rhombus = context.getBean(Rhombus.class);
		rhombus.draw();
		
		context.close();
	}

}
