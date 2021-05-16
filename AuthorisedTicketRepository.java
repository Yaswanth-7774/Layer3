package com.example.bus.repos;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bus.pojos.Auth;
import com.example.bus.pojos.Busroute;
@Repository
public interface AuthorisedTicketRepository {
	
	void addAuthorisedTicket(Auth auth);
	Auth findAuthorisedTicket(int id);
	List<Auth> findAuthorisedTickets();
	void modifyAuthorisedTicket(Auth auth);
	void removeAuthorisedTicket(int id);
}
