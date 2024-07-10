package com.WS_PQRTravels_Producer.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.WS_PQRTravels_Producer.model.Travels2;
import com.WS_PQRTravels_Producer.repository.SecTRepository;
import com.WS_PQRTravels_Producer.service.SecTService;

@Service
public class SecTServiceImpl implements SecTService{

	@Autowired
	private SecTRepository str;
	
	@Override
	public Travels2 saveFirstTData(Travels2 t2) {
		Travels2 db_travels2=str.save(t2);
		return db_travels2;
	}

	@Override
	public List<Travels2> getAllSTData() {
	List<Travels2>lt=str.findAll();
		return lt;
	}

	@Override
	public List getAllByBsName(String busname) {
		List lt=str.getBytravel2Name(busname);
		return lt;
	}
	@Override
	public List getBsNameFrTo(String busname, String busFrom, String busTo) {
		List al=str.getByNmFrmTo(busname,busFrom,busTo);
		return al;
	}

	@Override
	public List<Travels2> getByBsDate(String busDate) {
		List<Travels2>bl=str.getByDate(busDate);
		return bl.stream().sorted((b1,b2)->b1.getBusDate().compareTo(b2.getBusDate())).toList();
	}

	
	

}
