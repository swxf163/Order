package cn.jbit.order.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;

import cn.jbit.order.dao.OrdersDao;
import cn.jbit.order.dao.impl.OrdersDaoImpl;
import cn.jbit.order.entity.Orderitem;
import cn.jbit.order.entity.Orders;

public class OrdersDaoImplTest {

	OrdersDao dao = new OrdersDaoImpl();
	
	//@Ignore
	@Test
	public void testFindById() {
		Orders orders = dao.findById(new Long("5"));
		System.out.println(orders);
		for (Orderitem item : orders.getOrderitems()) {
			System.out.println(item.getGoods().getName() + item.getAmount());
		}
	}

	@Ignore
	@Test
	public void testSave() {		
		Orders orders = new Orders();
		orders.setName("1111");
		orders.setCreatetime(new Date());
		orders.setAddress("123");
		System.out.println(dao.save(orders));
	}
}
