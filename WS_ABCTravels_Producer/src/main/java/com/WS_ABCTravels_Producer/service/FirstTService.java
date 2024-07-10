package com.WS_ABCTravels_Producer.service;

import java.util.List;

import com.WS_ABCTravels_Producer.model.Travel1;

public interface FirstTService {

	

	public Travel1 saveFirstTData(Travel1 t1);

	public List<Travel1> getAllFTData();

	public List getAllByBsName(String busname);

	public List getBsNameFrTo(String busname, String busFrom, String busTo);

	public List getByBsDate(String busDate);

}
