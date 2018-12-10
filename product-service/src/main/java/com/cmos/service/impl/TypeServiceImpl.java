package com.cmos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmos.dao.TypeDao;
import com.cmos.entity.Type;
import com.cmos.service.TypeService;
@Service("typeService")
public class TypeServiceImpl implements TypeService  {

	@Autowired
	private TypeDao typeDao;
	
	public List<Type> getList(Integer id) {
		// TODO Auto-generated method stub
		return typeDao.getList(id);
	}
}
