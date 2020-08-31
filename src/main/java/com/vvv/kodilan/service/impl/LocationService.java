package com.vvv.kodilan.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vvv.kodilan.repository.ILocationRepository;
import com.vvv.kodilan.service.ILocationService;
import com.vvv.kodilan.view.pub.Location;
import com.vvv.kodilan.view.pub.PostView;

@Service
public class LocationService implements ILocationService {

	@Autowired
	private ILocationRepository locationRepository;
	
	@Override
	public List<Location> getLocationList() {

		ObjectMapper mapper = new ObjectMapper();

		ClassPathResource cp = new ClassPathResource("data/data-location.json");
		if (cp.exists()) {
			try {
				return mapper.readValue(cp.getInputStream(), new TypeReference<List<Location>>(){});
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return new ArrayList<>();
	}

}
