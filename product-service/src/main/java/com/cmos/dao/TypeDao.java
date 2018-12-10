package com.cmos.dao;
import java.util.List;

import com.cmos.entity.Type;
public interface TypeDao {
	
	List<Type> getList(Integer id);
	
}
