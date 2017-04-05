package cn.jbit.order.biz;

import java.util.List;

import cn.jbit.order.entity.Goods;

public interface GoodsService {
	public List<Goods> findAll();
	public Goods findById(Long id);
}
