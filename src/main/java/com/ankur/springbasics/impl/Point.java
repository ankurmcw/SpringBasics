package com.ankur.springbasics.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Point implements ApplicationContextAware, BeanNameAware {
	
	private int x;
	
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public void setBeanName(String beanName) {
		//System.out.println("Bean Name: " + beanName);
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		//System.out.println("Context is initialized: " + context.getBeanDefinitionCount());
	}
}
