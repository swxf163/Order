package cn.jbit.order.biz.impl;

import cn.jbit.order.biz.OrdersService;
import cn.jbit.order.dao.OrderitemDao;
import cn.jbit.order.dao.OrdersDao;
import cn.jbit.order.dao.impl.OrderitemDaoImpl;
import cn.jbit.order.dao.impl.OrdersDaoImpl;
import cn.jbit.order.entity.Orderitem;
import cn.jbit.order.entity.Orders;

public class OrdersServiceImpl implements OrdersService {
	
	private OrdersDao ordersDao = new OrdersDaoImpl();
	private OrderitemDao orderitemDao = new OrderitemDaoImpl();

	public Long save(Orders orders) {
		Long id = null;
		try {
			id = ordersDao.save(orders);
			for (Orderitem oi : orders.getOrderitems()) {
				orderitemDao.save(oi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}

	public Orders findById(Long id) {
		return ordersDao.findById(id);
	}

}
