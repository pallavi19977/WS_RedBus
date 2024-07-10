package com.WS_PQRTravels_Producer.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Travels2 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int busId;
	private String busNo;
	private String busname;
	private String busFrom;
	private String busTo;
	private String busDate;
	private String busTimming;
	private float busTicket;
}