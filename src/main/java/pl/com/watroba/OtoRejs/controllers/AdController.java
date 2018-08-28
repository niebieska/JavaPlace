package pl.com.watroba.OtoRejs.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.com.watroba.OtoRejs.dao.CruisesDAO;
import pl.com.watroba.OtoRejs.models.Cruise;

@RestController
public class AdController {
    @Autowired
	private CruisesDAO field;
	@GetMapping("/")
	public String home () {return "Hello from the other side !";}
	@GetMapping("/cruises")
	public List <Cruise> getAllCruises() 
	{
		return Arrays.asList(field.allCruises());//new Cruise(1,"Rejs po Schaboszczaka","Szalona przygoda z zagrożeniem życia",2000));
	}
	
}