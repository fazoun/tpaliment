package com.epita.tpaliment.infra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.epita.tpaliment.entity.Aliment;

@Repository
public class DaoAlimentImpl implements DaoAliment {

	public void create(Aliment a) { 
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(a);
		session.getTransaction();
		session.close();
	}
}
