package com.trade.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.trade.dao.GoodsDao;
import com.trade.domain.Goods;
import com.trade.domain.PageBean;
import com.trade.domain.Student;
import com.trade.services.GoodsService;

@Transactional
public class GoodsServiceImpl implements GoodsService{

	private GoodsDao goodsDao;
	
	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}

	@Override
	public void upload(Goods goods) {
		goodsDao.upload(goods);
	}

	@Override
	public List<Goods> findAll() {
		List<Goods> list = goodsDao.findAll();
		return list;
	}

	@Override
	public List<Goods> findByName(String searchName) {
		List<Goods> searchList=goodsDao.findByName(searchName);
		return searchList;
	}

	@Override
	public Goods findById(Integer goodsId) {
		Goods exitGoods=goodsDao.findById(goodsId);
		return exitGoods;
	}

	@Override
	public List<Goods> findMyGoods(Integer studentId) {
		List<Goods> myList=goodsDao.findMyGoods(studentId);
		return myList;
	}

	@Override
	public void delete(Goods goods) {
		goodsDao.delete(goods);
	}

	@Override
	public void update(Goods goods) {
		goodsDao.update(goods);
	}

}
