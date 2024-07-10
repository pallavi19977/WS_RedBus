package com.WS_PQRTravels_Producer.service;

import java.util.List;

import com.WS_PQRTravels_Producer.model.Travels2;

public interface SecTService {

	public Travels2 saveFirstTData(Travels2 t2);

	public List<Travels2> getAllSTData();

	public List getAllByBsName(String busname);

	public List getBsNameFrTo(String busname, String busFrom, String busTo);

	public List getByBsDate(String busDate);

}
