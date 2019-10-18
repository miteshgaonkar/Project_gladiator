package com.lti.finance.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class GenericDao { // BaseDao,CommonDao,SabkaDao,ApnaDao

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void upsert(Object obj) {

		entityManager.merge(obj);
	}

	public Object fetchById(Class clazz, Object pk) {
		Object obj = entityManager.find(clazz, pk);
		return obj;
	}

}
