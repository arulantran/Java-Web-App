package com.kce.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory sessionFactory;
	public static SessionFactory createSession() {
		try {
			sessionFactory = new Configuration().configure("mysqlhiber.cfg.xml").buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			e.printStackTrace();
			return sessionFactory;

		}
	}
}
