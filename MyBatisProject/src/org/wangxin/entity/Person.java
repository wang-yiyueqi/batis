package org.wangxin.entity;
/** 
* @author : wangxin
* @date 创建时间：2020/05/06 16:09:22 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class Person {
	private int id;
	private String name;
	private int age;
	
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.id + "," + this.name + "," +this.age ;
	}
	

}
