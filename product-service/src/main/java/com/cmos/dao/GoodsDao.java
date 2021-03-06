package com.cmos.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cmos.entity.Sku;

public interface GoodsDao {

Sku getEntity(Integer id);
	
	void updateSku(Sku sku);
	
	List<Sku> getAll(@Param("startPage")int startPage,@Param("rows")int rows);
	
	Integer deleteGoods(Integer id);
	
	Integer deleteGoodsList(List<Integer> list);

	List<Sku> getAllByParam(@Param("sku")Sku sku);

	Integer getTotal(@Param("sku")Sku sku);
}
