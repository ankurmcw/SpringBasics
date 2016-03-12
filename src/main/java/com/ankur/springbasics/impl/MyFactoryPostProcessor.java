package com.ankur.springbasics.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException
	{
		System.out.println("Inside postprocessBeanFactory, singleton count is " + beanFactory.getSingletonCount());
	}

}
