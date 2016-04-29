package com.serol.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.serol.pojo.Person;
import com.serol.service.IPersonService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class JunitTest {
	
	@Autowired
	private IPersonService personService;
	
	private Person person;
	
	@Test
	public void testSelectPersion()
	{
		person = personService.selectByPrimaryKey(1);
		if(person != null)
		{
			System.out.println("用户名：" + person.getUsername());
		}else{
			System.out.println("用户名为空");
		}
	}
}
