package com.app.bankexample.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.app.bankexample.model.Location;



@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties
public class GeoService {
	@Value("${KEY}")
	private String KEY;
public Location getLocation(String place) {
	
	RestTemplate restTemplate = new RestTemplate();
    Location location = restTemplate.getForObject("https://api.opencagedata.com/geocode/v1/json?q="+place+"&key="+KEY+"&language=en&pretty=1", Location.class);
    return location;
	}
}
