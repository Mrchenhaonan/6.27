package com.chenhaonan.senior1.week2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chenhaonan.senior1.week2.entity.Person;
import com.chenhaonan.senior1.week2.service.PersonService;

@Controller
public class PersonController {//controller层
	@Autowired//依赖
	private PersonService service;
	@RequestMapping("lists")
	public String lists(Model model){//列表
		List<Person> list=service.selects();
		model.addAttribute("list", list);
		return "lists";//返回
		
	}
}
