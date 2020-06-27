package com.chenhaonan.senior1.week2.entity;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chenhaonan.common.utils.RandomUtil.RandomUtil;
import com.chenhaonan.common.utils.StringUtil.StringUtil;
import com.chenhaonan.senior1.week2.service.PersonService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="class:spring-beans.xml")
public class PersonTest {
@Autowired
private PersonService service;
	@Test
	public void test() {//测试
		Person p = new Person();
		for (int i = 0; i < 10000; i++) {//生成一万条
			p.setName(StringUtil.generateChineseName());
			Date randomDate=randomDate("1940-09-20", "2000-01-01");//随机日期
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh::mm:ss");
			String result=format.format(randomDate);
			p.setBirthday(result);
			String zifu="";
			for (int j = 0; j < 10; j++) {
				zifu+=RandomUtil.generateChineseRandom();//循环调用
			}
			p.setAddress(zifu);
			p.setScore(RandomUtil.randomNum(10, 9999));
			int flag=service.insert(p);
			
		}
	}
	public static Date randomDate(String beginDate,String endDate){//随即日期
		try {
			SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd");
			Date start= format.parse(beginDate);
			Date end= format.parse(endDate);
			if(start.getTime()>=end.getTime()){
				return null;
			}
			long date=random(start.getTime(),end.getTime());
			return new Date(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	private static long random(long begin, long end) {//随机日期
		// TODO Auto-generated method stub
		long rtn=begin+(long)(Math.random()*(end-begin));
		if(rtn==begin||rtn==end){
			return random(begin, end);
		}
		return rtn;
	}
	

}
