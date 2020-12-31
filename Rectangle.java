package com.shape;

public class Rectangle extends Shape {
public Rectangle(String name,int leng,int bred) {
		super(name);
		this.leng=leng;
		this.bred=bred;
	}
@Override
public String toString() {
	return "Rectangle [leng=" + leng + ", bred=" + bred + ", name=" + name + "]";
}
int leng,bred;
@Override
public double calcArea()
{
	return Math.round(leng*bred);
}
@Override
public double calcPerim()
{
	return Math.round(2*(leng+bred));
}

}
