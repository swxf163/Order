package cn.jbit.order.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import cn.jbit.order.dao.GoodsDao;
import cn.jbit.order.dao.OrderitemDao;
import cn.jbit.order.dao.OrdersDao;
import cn.jbit.order.dao.impl.GoodsDaoImpl;
import cn.jbit.order.dao.impl.OrderitemDaoImpl;
import cn.jbit.order.dao.impl.OrdersDaoImpl;
import cn.jbit.order.entity.Goods;
import cn.jbit.order.entity.Orderitem;
import cn.jbit.order.entity.Orders;
import cn.jbit.order.util.HibernateSessionFactory;

public class OrderitemDaoImplTest {

	OrderitemDao orderitemDao = new OrderitemDaoImpl();
	GoodsDao goodsDao = new GoodsDaoImpl();
	OrdersDao ordersDao = new OrdersDaoImpl();

	@Ignore
	@Test
	public void testSave() {
		Orders orders = (Orders) HibernateSessionFactory.getSession().get(Orders.class, (long)5);
		HibernateSessionFactory.closeSession();
		Orderitem item = new Orderitem();
		Goods goods1 = goodsDao.findById((long) 3);
		item.setGoods(goods1);
		item.setAmount((long) 2);
		item.setOrders(orders);
		orderitemDao.save(item);
	}

	@Ignore
	@Test
	public void testDeleteById() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

}
