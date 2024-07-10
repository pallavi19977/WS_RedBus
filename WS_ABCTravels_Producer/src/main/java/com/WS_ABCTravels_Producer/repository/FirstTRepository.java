package com.WS_ABCTravels_Producer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.WS_ABCTravels_Producer.model.Travel1;

@Repository
public interface FirstTRepository extends JpaRepository<Travel1, Integer> {

	
	@Query(name="getBytravelName",value="from Travel1 where busname=?1")
	public List getBytravelName(String busname);

	@Query(name="getByNmFrmTo",value="from Travel1 where busname=?1 and busFrom=?2 and busTo=?3")
	public List getByNmFrmTo(String busname, String busFrom, String busTo);

	@Query(name="getByDate",value="from Travel1 where busDate=?1")
	public List<Travel1> getByDate(String busDate);

	


}
