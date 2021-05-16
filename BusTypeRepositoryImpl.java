package com.example.bus.repos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.bus.pojos.Bustype;
import com.example.demo.layer2.Department5;
@Repository
public class BusTypeRepositoryImpl implements BusTypeRepository {
	@PersistenceContext
	EntityManager entityManager;
	@Transactional
	public void addBusType(Bustype bty) {
		// TODO Auto-generated method stub
		entityManager.persist(bty);
	}

	@Transactional
	public Bustype findBusType(int bno) {
		// TODO Auto-generated method stub
		return entityManager.find(Bustype.class,bno);
	}

	@Transactional
	public List<Bustype> findBustypes() {
		List<Bustype> busList;
		busList = new ArrayList<Bustype>();
		
			String queryString = "from Bustype";
			Query query = entityManager.createQuery(queryString);
			busList = query.getResultList();
		return busList;
	}

	@Transactional
	public void modifyBustype(Bustype bty) {
		// TODO Auto-generated method stub
		entityManager.merge(bty);
	}

	@Transactional
	public void removeBusRoute(int bno) {
		// TODO Auto-generated method stub
		Bustype bTemp = entityManager.find(Bustype.class,bno);
		entityManager.remove(bTemp);
	}

}
