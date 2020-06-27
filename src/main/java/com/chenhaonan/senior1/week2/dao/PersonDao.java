package com.chenhaonan.senior1.week2.dao;

import java.util.List;

import com.chenhaonan.senior1.week2.entity.Person;

public interface PersonDao {//dao层

	int insert(Person p);//添加

	List<Person> list();//列表

}
