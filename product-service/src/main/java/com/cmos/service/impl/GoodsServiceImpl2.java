package com.cmos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmos.dao.GoodsDao;
import com.cmos.entity.Sku;
import com.cmos.service.GoodsService;

@Service("goodsService2")
public class GoodsServiceImpl2 implements GoodsService {

	@Autowired
	private GoodsDao goodsDao;

	public Sku getEntity(Integer id) throws InterruptedException {
		Sku sku = null;
		sku = goodsDao.getEntity(id);
		System.out.println("2.00000000");
		return sku;
	}

	public void updateSku(Sku sku) {
		try {
			goodsDao.updateSku(sku);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Sku> getAll(int startPage, int rows) {
		return goodsDao.getAll(startPage, rows);
	}

	public Integer deleteGoods(Integer id) {
		Integer result = goodsDao.deleteGoods(id);
		return result;
	}

	public Integer deleteGoodsList(List<Integer> list) {
		if (list != null && !list.isEmpty()) {
			Integer result = goodsDao.deleteGoodsList(list);
			return result;
		}
		return null;
	}

	public List<Sku> getAllByParam(Sku sku) {
		// TODO Auto-generated method stub

		return goodsDao.getAllByParam(sku);
	}

	public Integer getTotal(Sku sku) {
		// TODO Auto-generated method stub
		return goodsDao.getTotal(sku);
	}

}
