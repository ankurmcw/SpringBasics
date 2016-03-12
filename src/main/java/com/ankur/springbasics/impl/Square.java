package com.ankur.springbasics.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.ankur.springbasics.interfaces.Shape;

public class Square implements Shape, InitializingBean, DisposableBean{

	private Point pointA;
	
	private Point pointB;
	
	private Point pointC;
	
	private Point pointD;
	
	public Square() {}
	
	public Square (Point pointA, Point pointB, Point pointC, Point pointD) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
	}
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	@Override
	public void draw() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Square [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + ", pointD=" + pointD + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method is called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("AfterPropertiesSet method is called");		
	}
	
	public void initMethod()
	{
		System.out.println("initMethod is called");
	}
	
	public void cleanUp()
	{
		System.out.println("cleanUp method is called");
	}
}
