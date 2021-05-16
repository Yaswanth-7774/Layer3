package com.example.bus.repos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.bus.pojos.Reservation;
import com.example.demo.layer2.Department5;
@Repository
public class ReservationRepositoryImpl implements ReservationRepository {
	@PersistenceContext
	EntityManager entityManager;
	@Transactional
	public void addReservation(Reservation reserv) {
		// TODO Auto-generated method stub
		entityManager.persist(reserv);
	}

	@Transactional
	public Reservation findReservation(int tno) {
		// TODO Auto-generated method stub
		return entityManager.find(Reservation.class,tno);
	}

	@Transactional
	public List<Reservation> findReservations() {
		// TODO Auto-generated method stub
		List<Reservation> reservList;
		reservList = new ArrayList<Reservation>();
		
			String queryString = "from Reservation";
			Query query = entityManager.createQuery(queryString);
			reservList = query.getResultList();
		return reservList;
	}

	@Transactional
	public void modifyReservation(Reservation reserv) {
		// TODO Auto-generated method stub
		entityManager.merge(reserv);
	}

	@Transactional
	public void removeReservation(int tno) {
		// TODO Auto-generated method stub
		Reservation reservTemp = entityManager.find(Reservation.class, tno);
		entityManager.remove(reservTemp);
	}

}
