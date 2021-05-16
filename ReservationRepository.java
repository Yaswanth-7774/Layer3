package com.example.bus.repos;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.bus.pojos.Reservation;


@Repository
public interface ReservationRepository {
	
	void addReservation (Reservation reserv);
	Reservation findReservation(int tno);
	List<Reservation> findReservations();
	void modifyReservation(Reservation reserv);
	void removeReservation(int tno);
}
