package com.shape;

public class Circle extends Shape {
public Circle(String name,int radius) {
		super(name);
		this.radius=radius;
	}
@Override
public String toString() {
	return "Circle [radius=" + radius + ", name=" + name + "]";
}
int radius;
@Override
public double calcArea()
{
	return Math.round(3.14*radius*radius)+calcarea();
}
@Override
public double calcPerim()
{
	return Math.round(2*3.14*radius);
}
}
