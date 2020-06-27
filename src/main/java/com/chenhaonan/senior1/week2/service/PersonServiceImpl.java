package com.chenhaonan.senior1.week2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenhaonan.senior1.week2.dao.PersonDao;
import com.chenhaonan.senior1.week2.entity.Person;

@Service
public class PersonServiceImpl implements PersonService{//service层
	@Autowired//
	private PersonDao dao;//依赖

	@Override
	public int insert(Person p) {//添加
		// TODO Auto-generated method stub
		return dao.insert(p);
	}

	@Override
	public List<Person> selects() {//列表
		// TODO Auto-generated method stub
		return dao.list();
	}
}
