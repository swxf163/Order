package cn.jbit.order.dao;

import cn.jbit.order.entity.Orders;

public interface OrdersDao {
	public Long save(Orders transientInstance);
	public void deleteById(Long id);
	public Orders findById(Long id);
}
