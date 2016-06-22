package com.leilei.miaomiao.javaWeb;

import java.sql.Date;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Custorm {
	private String name ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private int age;
	private Date date;
	public Custorm(String name, int age, Date date) {
		super();
		this.name = name;
		this.age = age;
		this.date = date;
	}
	public Custorm() {
			System.out.println("javaBean--custorm is coming!!!");
	
	}
}
