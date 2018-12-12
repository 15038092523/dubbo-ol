package com.cmos.service;

import java.util.List;

import com.cmos.entity.Sku;

public interface GoodsService {
	Sku getEntity(Integer id) throws InterruptedException;

	void updateSku(Sku sku);

	List<Sku> getAll(int startPage, int rows);

	Integer deleteGoods(Integer id);

	Integer deleteGoodsList(List<Integer> list);

	List<Sku> getAllByParam(Sku sku);

	Integer getTotal(Sku sku);
}
