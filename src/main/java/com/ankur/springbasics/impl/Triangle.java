package com.ankur.springbasics.impl;

import org.springframework.beans.factory.annotation.Required;

import com.ankur.springbasics.interfaces.Shape;

public class Triangle implements Shape {
	
	private Point pointA;
		
	private Point pointB;
		
	private Point pointC;
		
	public Point getPointA() {
		return pointA;
	}
	
	@Required
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}
	
	@Required
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}
	
	@Required
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public void draw() {		
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
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
