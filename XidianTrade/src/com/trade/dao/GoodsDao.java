package com.trade.dao;

import java.util.List;

import com.trade.domain.Goods;

public interface GoodsDao {

	void upload(Goods goods);
	
	List<Goods> findAll();

	List<Goods> findByName(String searchName);

	Goods findById(Integer goodsId);

	List<Goods> findMyGoods(Integer studentId);

	void delete(Goods goods);

	void update(Goods goods);

}
