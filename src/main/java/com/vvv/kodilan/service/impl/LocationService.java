package com.vvv.kodilan.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvv.kodilan.repository.ILocationRepository;
import com.vvv.kodilan.service.ILocationService;
import com.vvv.kodilan.view.pub.Location;

@Service
public class LocationService implements ILocationService {

	@Autowired
	private ILocationRepository locationRepository;
	
	@Override
	public List<Location> getLocationList() {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}

}
