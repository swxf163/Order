package cn.jbit.order.dao.impl;

import org.hibernate.Transaction;

import org.hibernate.Session;

import cn.jbit.order.dao.BaseHibernateDAO;
import cn.jbit.order.dao.OrdersDao;
import cn.jbit.order.entity.Orders;

public class OrdersDaoImpl extends BaseHibernateDAO implements OrdersDao {

	public Long save(Orders transientInstance) {
		Long id = null;
		Session session = null;
		Transaction tx = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			id = (Long) session.save(transientInstance);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			closeSession();
		}
		return id;
	}

	public void deleteById(Long id) {
		Session session = null;
		Transaction tx = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			Orders orders = (Orders) session.load(Orders.class, id);
			session.delete(orders);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			closeSession();
		}
	}

	public Orders findById(Long id) {
		Orders orders = null;
		Session session = null;
		String hql = "select distinct o from Orders o inner join fetch o.orderitems oi where o.id = :id";
		try {
			session = getSession();
			orders = (Orders) session.createQuery(hql).setLong("id", id).uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession();
		}
		return orders;
	}

}
