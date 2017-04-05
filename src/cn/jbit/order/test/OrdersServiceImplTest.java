package cn.jbit.order.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;

import cn.jbit.order.biz.OrdersService;
import cn.jbit.order.biz.impl.OrdersServiceImpl;
import cn.jbit.order.dao.GoodsDao;
import cn.jbit.order.dao.OrderitemDao;
import cn.jbit.order.dao.OrdersDao;
import cn.jbit.order.dao.impl.GoodsDaoImpl;
import cn.jbit.order.dao.impl.OrderitemDaoImpl;
import cn.jbit.order.dao.impl.OrdersDaoImpl;
import cn.jbit.order.entity.Goods;
import cn.jbit.order.entity.Orderitem;
import cn.jbit.order.entity.Orders;

public class OrdersServiceImplTest {

	OrdersService ordersService = new OrdersServiceImpl();
	GoodsDao goodsDao = new GoodsDaoImpl();

	@Test
	public void testSave() {
		Orders orders = new Orders();
		orders.setName("1111");
		orders.setCreatetime(new Date());
		orders.setAddress("123");
		
		Goods goods1 = goodsDao.findById((long) 2);
		
		Orderitem item = new Orderitem();
		item.setGoods(goods1);
		item.setAmount((long) 2);
		
		orders.getOrderitems().add(item);
		//goods1.getOrderitems().add(item);
		item.setGoods(goods1);
		item.setOrders(orders);
		
		System.out.println(ordersService.save(orders));
	}

	@Ignore
	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

}
