package cn.jbit.order.biz;

import cn.jbit.order.entity.Orders;

public interface OrdersService {
	public Long save(Orders orders);
	public Orders findById(Long id);
}
