package com.example.bus.repos;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bus.pojos.Bustype;


@Repository
public interface BusTypeRepository {
	
	void addBusType(Bustype bty);
	Bustype findBusType(int bno);
	List<Bustype> findBustypes();
	void modifyBustype(Bustype bty);
	void removeBusRoute(int bno);
}
