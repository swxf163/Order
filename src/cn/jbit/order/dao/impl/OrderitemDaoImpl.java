package cn.jbit.order.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.jbit.order.dao.BaseHibernateDAO;
import cn.jbit.order.dao.OrderitemDao;
import cn.jbit.order.entity.Orderitem;

public class OrderitemDaoImpl extends BaseHibernateDAO implements OrderitemDao {

	public void save(Orderitem transientInstance) {
		Session session = null;
		Transaction tx = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.save(transientInstance);
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

	public void deleteById(Long id) {
		Session session = null;
		Transaction tx = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			Orderitem item = (Orderitem) session.load(Orderitem.class, id);
			session.delete(item);
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

	public Orderitem findById(Long id) {
		Orderitem item = null;
		Session session = null;
		try {
			session = getSession();
			item = (Orderitem) session.get(Orderitem.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession();
		}
		return item;
	}

}
