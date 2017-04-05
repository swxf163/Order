package cn.jbit.order.biz.impl;

import cn.jbit.order.biz.OrdersService;
import cn.jbit.order.dao.OrdersDao;
import cn.jbit.order.dao.impl.OrdersDaoImpl;
import cn.jbit.order.entity.Orders;

public class OrdersServiceImpl implements OrdersService {
	
	private OrdersDao ordersDao = new OrdersDaoImpl();

	public Long save(Orders orders) {
		// TODO Auto-generated method stub
		return null;
	}

	public Orders findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
