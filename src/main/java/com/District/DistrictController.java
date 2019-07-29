package com.District;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistrictController {
    @Autowired
	DistrictService ds;
    
    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/DistrictInfo/{name}")
	public ResponseEntity<DistrictInfo> getInformation(@PathVariable String name) {
    	//System.out.println("*********"+name);
    	Optional<DistrictInfo> di=ds.getInfo(name);
    	if(di.isPresent()) { 
    		System.out.println(di.get().getName());
    		return new ResponseEntity<>(di.get(),HttpStatus.OK);}
    	else  return new ResponseEntity<>(null,HttpStatus.NOT_FOUND); 
    	
	}
}
