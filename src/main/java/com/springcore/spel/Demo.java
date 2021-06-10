package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{12+12}")
	int x;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	int y;
	@Value("#{T(java.lang.Math).PI}")
	double z;
	@Value("#{new java.lang.String('Mohsin Khan')}")
	String name;
	@Value("#{4<5? true:false}")
	boolean isActive;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
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
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", isActive=" + isActive + "]";
	}


	

}
