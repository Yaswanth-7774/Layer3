package com.example.bus.repos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.bus.pojos.Busroute;
import com.example.demo.layer2.Department5;
@Repository
public class BusRouteRepositoryImpl implements BusRouteRepository {

	@PersistenceContext
	EntityManager entityManager;
	@Override
	public void addBusRoute(Busroute bRou) {
		// TODO Auto-generated method stub
		entityManager.persist(bRou);
	}

	@Override
	@Transactional
	public Busroute findBusRoute(int rno) {
		// TODO Auto-generated method stub
		System.out.println("find Busroute");
		return entityManager.find(Busroute.class, rno);
	}

	@Override
	public List<Busroute> findBusRoutes() {
		// TODO Auto-generated method stub
		List<Busroute> rouList;
		rouList = new ArrayList<Busroute>();
		
			String queryString = "from Busroute";
			Query query = entityManager.createQuery(queryString);
			rouList = query.getResultList();
		return rouList;
	}

	@Override
	public void modifyBusRoute(Busroute bRou) {
		// TODO Auto-generated method stub
		entityManager.merge(bRou);
	}

	@Override
	public void removeBusRoute(int rno) {
		// TODO Auto-generated method stub
		Busroute brTemp=  entityManager.find(Busroute.class, rno);
	}

}
