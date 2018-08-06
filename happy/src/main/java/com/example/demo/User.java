package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class User
{
	 @Id
     private int id;
     private String name;
     private int count =3;
     private int flag=0;
	
     public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
}  