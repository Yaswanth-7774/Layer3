package com.example.bus.repos;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bus.pojos.Busroute;
import com.example.bus.pojos.Registration;
@Repository
public interface RegistrationRepository {
	
	void addRegistration(Registration reg);
	Registration findRegistration(String email);
	List<Registration> findRegistrations();
	void modifyRegistration(Registration reg);
	void removeRegistration(String email);
}
