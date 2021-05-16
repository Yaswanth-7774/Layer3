package com.example.bus.repos;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bus.pojos.Auth;
import com.example.bus.pojos.Busroute;
import com.example.bus.pojos.Unauth;
@Repository
public interface UnAuthorisedTicketRepository {
	
	void addUnAuthorisedTicket(Unauth unauth);
	Unauth findUnAuthorisedTicket(int id);
	List<Unauth> findUnAuthorisedTickets();
	void modifyUnAuthorisedTicket(Unauth unauth);
	void removeUnAuthorisedTicket(int id);
}
