package com.ankur.springbasics.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanNamePostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.println("Inside postProcessAfterInitialization for bean: " + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.println("Inside postProcessBeforeInitialization for bean: " + beanName);
		return bean;
	}

}
