package com.District;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictService {
	@Autowired
    DistrictRepo obj;
	
	public Optional<DistrictInfo> getInfo(String name)
	{
		return obj.findById(name);
		
	}
}
