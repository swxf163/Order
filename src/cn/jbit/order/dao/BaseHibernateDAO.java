package cn.jbit.order.dao;

import org.hibernate.Session;

import cn.jbit.order.util.HibernateSessionFactory;

public class BaseHibernateDAO {
	/**
	 * 获得Session
	 * @return
	 */
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
	/**
	 * 关闭Session
	 */
	public void closeSession() {
		HibernateSessionFactory.closeSession();
	}
}
