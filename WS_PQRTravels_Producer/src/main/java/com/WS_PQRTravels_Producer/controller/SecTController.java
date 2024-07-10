package com.WS_PQRTravels_Producer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.WS_PQRTravels_Producer.model.Travels2;
import com.WS_PQRTravels_Producer.service.SecTService;


@RestController
public class SecTController {

	@Autowired
	private SecTService sts;
	
	@PostMapping("/regSTravelData")
	public String regFTData(@RequestBody Travels2 t2)
	{
		Travels2 tr2=sts.saveFirstTData(t2);
		return "Travel2 Data Registered....";
	}
	@GetMapping("/getAllSTData")
	public List <Travels2> getAllSTData()
	{
		
		return sts.getAllSTData();
	}
	@GetMapping("/getAllByBusNm/{busname}")
	public List getAllByBsName(@PathVariable String busname)
	{
		List al=sts.getAllByBsName(busname);
		return al;
	}
	@GetMapping("/getByBsNmFrmTo/{busname}/{busFrom}/{busTo}")
	public List getBsNameFrTo(@PathVariable String busname,@PathVariable String busFrom,@PathVariable String busTo)
	{
		List al=sts.getBsNameFrTo(busname,busFrom,busTo);
		return al;
	}
	@GetMapping("/getAllBydate/{busDate}")
	public List getByBsDate(@PathVariable String busDate)
	{
		List al=sts.getByBsDate(busDate);
		return al;
	}

}
