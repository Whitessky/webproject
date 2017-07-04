package com.trade.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.trade.dao.GoodsDao;
import com.trade.domain.Goods;

public class GoodsDaoImpl extends HibernateDaoSupport implements GoodsDao{

	@Override
	public void upload(Goods goods) {
		this.getHibernateTemplate().save(goods);
	}

	@Override
	public List<Goods> findAll() {
		DetachedCriteria criteria = DetachedCriteria.forClass(Goods.class);
		List<Goods> list = this.getHibernateTemplate().findByCriteria(
				criteria);
		return list;
	}

	@Override
	public List<Goods> findByName(String searchName) {
		String hql="from Goods where goodsName like '%"+searchName+"%'";
		List<Goods> searchList=this.getHibernateTemplate().find(hql);
		return searchList;
	}

	@Override
	public Goods findById(Integer goodsId) {
		String  hql="from Goods where goodsId=?";
		List<Goods> goodsList=this.getHibernateTemplate().find(hql,goodsId);
		if(goodsList.size()>0){
			return goodsList.get(0);
		}
		return null;
	}

	@Override
	public List<Goods> findMyGoods(Integer studentId) {
		String hql="from Goods where studentNo=?";
		List<Goods> myList=this.getHibernateTemplate().find(hql,studentId);
		return myList;
	}

	@Override
	public void delete(Goods goods) {
		this.getHibernateTemplate().delete(goods);
	}

	@Override
	public void update(Goods goods) {
		this.getHibernateTemplate().update(goods);
	}
	
	

}
