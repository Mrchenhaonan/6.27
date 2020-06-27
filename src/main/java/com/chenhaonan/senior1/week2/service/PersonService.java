package com.chenhaonan.senior1.week2.service;

import java.util.List;

import com.chenhaonan.senior1.week2.entity.Person;

public interface PersonService {//service

	int insert(Person p);//添加

	List<Person> selects();

}
