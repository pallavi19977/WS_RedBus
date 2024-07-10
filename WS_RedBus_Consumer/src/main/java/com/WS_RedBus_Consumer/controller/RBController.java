package com.WS_RedBus_Consumer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RBController {
	
	@Autowired
	RestTemplate restT;
	
	@GetMapping("/getRedBusData")
	public List<List> getBusData()
	{
		String urlTr1="http://localhost:4001/getAllFTData";
		List FT1ist=restT.getForObject(urlTr1, List.class);
		
		String urlTr2="http://localhost:4002/getAllSTData";
		List ST1ist=restT.getForObject(urlTr2, List.class);
		
		List <List>allTravels=new ArrayList();
		allTravels.add(FT1ist);
		allTravels.add(ST1ist);
		allTravels.forEach(t->t.forEach(trvl->{System.out.println(trvl);}));
		return 	allTravels.stream().flatMap(x->x.stream()).toList();//Get Data InOne[]
	}
	@GetMapping("/getRedBsDataByName/{busname}")
	public List<List> getBusDataByNm(@PathVariable("busname") String busname)
	{
		String urlTr1="http://localhost:4001/getAllByBusNm/"+busname;
		List FT1ist=restT.getForObject(urlTr1, List.class);
		
		String urlTr2="http://localhost:4002/getAllByBusNm/"+busname;
		List ST1ist=restT.getForObject(urlTr2, List.class);

		List<List>allTravels=new ArrayList();
		allTravels.add(FT1ist);
		allTravels.add(ST1ist);
		
		allTravels.forEach(t->t.forEach(trvl->{System.out.println(trvl);}));
		return 	allTravels.stream().flatMap(x->x.stream()).toList();
		
	}
	@GetMapping("/getRedBsDataByNmFrTo/{busname}/{busFrom}/{busTo}")
	public List<List>getByNmFrTo(@PathVariable("busname") String busname,@PathVariable("busFrom") String busFrom,
							@PathVariable("busTo") String busTo)
	{
		String urlTr1="http://localhost:4001/getByBsNmFrmTo/"+busname+"/"+busFrom+"/"+busTo;
		List FT1ist=restT.getForObject(urlTr1, List.class);
		
		String urlTr2="http://localhost:4002/getByBsNmFrmTo/"+busname+"/"+busFrom+"/"+busTo;
		List ST1ist=restT.getForObject(urlTr1, List.class);
		
//		List allTravels=new ArrayList();
//		allTravels.add(FT1ist);
//		allTravels.add(ST1ist);
//		return 	allTravels; This will give in Two diff 1st[] 2nd[]
		
		List<List>allTravels=new ArrayList();
		allTravels.add(FT1ist);
		allTravels.add(ST1ist);
		allTravels.forEach(t->t.forEach(trvl->{System.out.println(trvl);}));
		
		return 	allTravels.stream().flatMap(x->x.stream()).toList();//This will give[[]]No need List<List>on 49
		//While using this Take List<List> on line 49
	}
	@GetMapping("/getRedBsDataByDate/{busDate}")
	public List<List> getBusDataByDate(@PathVariable("busDate") String busDate)
	{
		String urlTr1="http://localhost:4001/getAllBydate/"+busDate;
		List FT1ist=restT.getForObject(urlTr1, List.class);
		
		String urlTr2="http://localhost:4002/getAllBydate/"+busDate;
		List ST1ist=restT.getForObject(urlTr2, List.class);

		List<List>allTravels=new ArrayList();
		allTravels.add(FT1ist);
		allTravels.add(ST1ist);
		
		allTravels.forEach(t->t.forEach(trvl->{System.out.println(trvl);}));
		return 	allTravels.stream().flatMap(x->x.stream()).toList();
		
	}


}
