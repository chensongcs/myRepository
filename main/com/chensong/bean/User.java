package com.chensong.bean;
/**
 * 用户类
 * 设计模式：构造器模式
 * @author Administrator
 *
 */
public class User {
	private int id;
	private String userName;
	private String password;
	private String realName;
	private String telephone;
	private char sex;
	private int age;
	private String address;
	private String country;
	private boolean isVip;
	
	public User(Builder builder){
		id = builder.id;
		userName = builder.userName;
		password = builder.password;
		realName = builder.realName;
		telephone = builder.telephone;
		sex = builder.sex;
		age = builder.age;
		address = builder.address;
		country = builder.country;
		isVip = builder.isVip;
	}
	
	
	
	public int getId() {
		return id;
	}



	public String getUserName() {
		return userName;
	}



	public String getPassword() {
		return password;
	}



	public String getRealName() {
		return realName;
	}



	public String getTelephone() {
		return telephone;
	}



	public char getSex() {
		return sex;
	}



	public int getAge() {
		return age;
	}



	public String getAddress() {
		return address;
	}



	public String getCountry() {
		return country;
	}



	public boolean isVip() {
		return isVip;
	}


	//静态内部类
	public static class Builder{
		private final int id;
		private final String userName;
		private final String password;
		private String realName;
		private String telephone;
		private char sex;
		private int age;
		private String address;
		private String country;
		private boolean isVip;
		
		public Builder(int id,String userName,String password){
			this.id = id;
			this.userName = userName;
			this.password = password;
		}
		
		public Builder setRealName(String realName){
			this.realName = realName;
			return this;
		}
		
		public Builder setTelephone(String telephone){
			this.telephone = telephone;
			return this;
		}
		
		public Builder setSex(char sex){
			this.sex = sex;
			return this;
		}
		
		public Builder setAge(int age){
			this.age = age;
			return this;
		}
		
		public Builder setAddress(String address){
			this.address = address;
			return this;
		}
		
		public Builder setCountry(String country){
			this.country = country;
			return this;
		}
		
		public Builder setIsVip(boolean isVip){
			this.isVip = isVip;
			return this;
		}
		
		public User build(){
			return new User(this);
		}
	}
}
