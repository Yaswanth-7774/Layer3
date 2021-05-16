package com.example.bus.repos;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bus.pojos.Busroute;
@Repository
public interface BusRouteRepository {
	
	void addBusRoute(Busroute bRou);
	Busroute findBusRoute(int rno);
	List<Busroute> findBusRoutes();
	void modifyBusRoute(Busroute bRou);
	void removeBusRoute(int rno);
}
