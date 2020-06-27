package com.chenhaonan.senior1.week2.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private Integer id;//id
	private String name;//姓名
	private String birthday;//生日
	private Integer score;//分数
	private String address;//地址
	
	public Person(Integer id, String name, String birthday, Integer score,//setting
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.score = score;
		this.address = address;
	}

	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", birthday=" + birthday
				+ ", score=" + score + ", address=" + address + "]";
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public Person() {
		super();
	}
	
}
