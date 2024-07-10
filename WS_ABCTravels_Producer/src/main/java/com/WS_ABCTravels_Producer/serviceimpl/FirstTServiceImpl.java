package com.WS_ABCTravels_Producer.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WS_ABCTravels_Producer.model.Travel1;
import com.WS_ABCTravels_Producer.repository.FirstTRepository;
import com.WS_ABCTravels_Producer.service.FirstTService;


@Service
public class FirstTServiceImpl implements FirstTService{

	@Autowired
	private FirstTRepository trr;
	@Override
	public Travel1 saveFirstTData(Travel1 t1)
	{
		Travel1 db_travel1=trr.save(t1);
		return db_travel1;
		
	}
	@Override
	public List<Travel1> getAllFTData() {
		List<Travel1>lt=trr.findAll();
		return lt;
	}
	@Override
	public List getAllByBsName(String busname) 
	{
		List lt=trr.getBytravelName(busname);
		return lt;
	}
	@Override
	public List getBsNameFrTo(String busname, String busFrom, String busTo) {
		List al=trr.getByNmFrmTo(busname,busFrom,busTo);
		return al;
	}
	@Override
	public List<Travel1> getByBsDate(String busDate) {
		List<Travel1>bl=trr.getByDate(busDate);
		return bl.stream().sorted((b1,b2)->b1.getBusDate().compareTo(b2.getBusDate())).toList();
	}
	
}
