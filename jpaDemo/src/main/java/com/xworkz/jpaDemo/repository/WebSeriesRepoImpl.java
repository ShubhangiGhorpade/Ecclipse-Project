package com.xworkz.jpaDemo.repository;

import javax.enterprise.inject.spi.InjectionTargetFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import static com.xworkz.jpaDemo.util.WebSeriesUtil.*;
import com.xworkz.jpaDemo.entity.WebSeries;

public class WebSeriesRepoImpl implements WebSeriesRepo {

	EntityManagerFactory factory = getFactory();

	@Override
	public boolean save(WebSeries entity) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return false;
	}

}
