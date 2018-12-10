package com.cmos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cmos.entity.Type;
import com.cmos.service.SupplierService;
import com.cmos.service.TypeService;

@Controller
public class Test {

	@Autowired
	private TypeService typeService;
	
	@Autowired
	private SupplierService supplierService;
	
	@ResponseBody
	@RequestMapping("/a")
	public List<Type> test1(){
		List<Type> list = typeService.getList(0);
		System.out.println(list.size());
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/b")
	public Integer test11(){
		return supplierService.getTotal();
	}
}
