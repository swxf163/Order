package cn.jbit.order.biz.impl;

import java.util.List;

import cn.jbit.order.biz.GoodsService;
import cn.jbit.order.dao.GoodsDao;
import cn.jbit.order.dao.impl.GoodsDaoImpl;
import cn.jbit.order.entity.Goods;

public class GoodsServiceImpl implements GoodsService {
	
	private GoodsDao goodsDao = new GoodsDaoImpl();

	public List<Goods> findAll() {
		return goodsDao.findAll();
	}

	public Goods findById(Long id) {
		return goodsDao.findById(id);
	}

}
