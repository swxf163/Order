package cn.jbit.order.dao;

import cn.jbit.order.entity.Orderitem;

public interface OrderitemDao {
	public void save(Orderitem transientInstance);
	public void deleteById(Long id);
	public Orderitem findById(Long id);
}
