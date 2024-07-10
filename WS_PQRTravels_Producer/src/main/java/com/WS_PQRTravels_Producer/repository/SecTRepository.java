package com.WS_PQRTravels_Producer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.WS_PQRTravels_Producer.model.Travels2;

@Repository
public interface SecTRepository extends JpaRepository<Travels2, Integer>{

	
	@Query(name="getBytravel2Name",value="from Travels2 where busname=?1")
	List getBytravel2Name(String busname);

	@Query(name="getByT2NmFrmTo",value="from Travels2 where busname=?1 and busFrom=?2 and busTo=?3")
	List getByT2NmFrmTo(String busname, String busFrom, String busTo);
	
	@Query(name="getByNmFrmTo",value="from Travels2 where busname=?1 and busFrom=?2 and busTo=?3")
	public List getByNmFrmTo(String busname, String busFrom, String busTo);


	@Query(name="getByDate",value="from Travels2 where busDate=?1")
	public List<Travels2> getByDate(String busDate);





}
