package cn.jbit.order.dao;

import java.util.List;

import cn.jbit.order.entity.Goods;

public interface GoodsDao {
	public Goods findById(Long id);
	public List<Goods> findAll();
}
