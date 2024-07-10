package com.WS_ABCTravels_Producer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.WS_ABCTravels_Producer.model.Travel1;
import com.WS_ABCTravels_Producer.service.FirstTService;


@RestController
public class FirstTController {
	@Autowired
	private FirstTService fts;
	@PostMapping("/regFTravelData")
	public String regFTData(@RequestBody Travel1 t1)
	{
		Travel1 tr1=fts.saveFirstTData(t1);
		return "Travel1 Data Registered....";
	}
	@GetMapping("/getAllFTData")
	public List <Travel1> getAllFTData()
	{
		
		return fts.getAllFTData();
	}
	@GetMapping("/getAllByBusNm/{busname}")
	public List getAllByBsName(@PathVariable String busname)
	{
		List al=fts.getAllByBsName(busname);
		return al;
	}
	@GetMapping("/getByBsNmFrmTo/{busname}/{busFrom}/{busTo}")
	public List getBsNameFrTo(@PathVariable String busname,@PathVariable String busFrom,@PathVariable String busTo)
	{
		List al=fts.getBsNameFrTo(busname,busFrom,busTo);
		return al;
	}
	@GetMapping("/getAllBydate/{busDate}")
	public List getByBsDate(@PathVariable String busDate)
	{
		List al=fts.getByBsDate(busDate);
		return al;
	}

}
