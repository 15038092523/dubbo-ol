package com.cmos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmos.dao.SupplierDao;
import com.cmos.service.SupplierService;
@Service("supplierService")
public class SupplierServiceImpl implements SupplierService{

	@Autowired
	private SupplierDao supplierDao;
	@Override
	public Integer getTotal() {
		// TODO Auto-generated method stub
		return supplierDao.getTotal();
	}

}
