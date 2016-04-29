package com.serol.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serol.dao.PersonMapper;
import com.serol.pojo.Person;
import com.serol.service.IPersonService;

@Service("personService")
public class PersonServiceImpl implements IPersonService {
	
	@Autowired
	private PersonMapper personMapper;
	
	public int deleteByPrimaryKey(Integer id) {
		return personMapper.deleteByPrimaryKey(id);
	}

	public int insert(Person record) {
		return personMapper.insert(record);
	}

	public int insertSelective(Person record) {
		return personMapper.insertSelective(record);
	}

	public Person selectByPrimaryKey(Integer id) {
		return personMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Person record) {
		return personMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Person record) {
		return personMapper.updateByPrimaryKey(record);
	}

}
