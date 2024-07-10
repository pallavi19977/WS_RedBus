package com.WS_RedBus_Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WsRedBusConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsRedBusConsumerApplication.class, args);
	}
	@Bean
	public RestTemplate restT()
	{
		RestTemplate rs=new RestTemplate();
		return rs;
	}
}
