package cn.jbit.order.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import cn.jbit.order.dao.BaseHibernateDAO;
import cn.jbit.order.dao.GoodsDao;
import cn.jbit.order.entity.Goods;

public class GoodsDaoImpl extends BaseHibernateDAO implements GoodsDao {

	public Goods findById(Long id) {
		Goods goods = null;
		Session session = null;
		try {
			session = getSession();
			goods = (Goods) session.get(Goods.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession();
		}
		return goods;
	}

	@SuppressWarnings("unchecked")
	public List<Goods> findAll() {
		List<Goods> list = new ArrayList<Goods>();
		Session session = null;
		try {
			session = getSession();
			list = session.createQuery("from Goods").list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession();
		}
		return list;
	}

}
