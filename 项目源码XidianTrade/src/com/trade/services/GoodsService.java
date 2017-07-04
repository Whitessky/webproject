package com.trade.services;

import java.util.List;

import com.trade.domain.Goods;
import com.trade.domain.PageBean;

public interface GoodsService {

	public void upload(Goods goods);
	
	public List<Goods> findAll();

	public List<Goods> findByName(String searchName);

	public Goods findById(Integer goodsId);

	public List<Goods> findMyGoods(Integer studentId);

	public void delete(Goods goods);

	public void update(Goods goods);

}
