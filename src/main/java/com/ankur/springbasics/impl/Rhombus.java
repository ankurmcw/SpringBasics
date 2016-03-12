package com.ankur.springbasics.impl;

import java.util.List;

import com.ankur.springbasics.interfaces.Shape;

public class Rhombus implements Shape{

	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	@Override
	public void draw() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Rhombus [points=" + points + "]";
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
