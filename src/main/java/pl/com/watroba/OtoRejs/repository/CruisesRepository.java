package pl.com.watroba.OtoRejs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pl.com.watroba.OtoRejs.models.Cruise;
@Scope(value="singleton")
@Component
public class CruisesRepository {
	final List<Cruise> cruises = new ArrayList<>();

	public CruisesRepository()
	{ 
		cruises.add(0,  new Cruise(1,"qrt","sqrt",2340));
		cruises.add(1,  new Cruise(1,"wrt","pow",2340));
		cruises.add(2,  new Cruise(1,"lonely","broken pieces of",100000));
	}
	 	public void add(Cruise newCruise) {
		cruises.add(newCruise);

	}

	public void delete(Cruise toDelete)
	{
		cruises.remove(toDelete);
	}
	
	public Cruise[] allCruises()
	{
	 
		return cruises.toArray(new  Cruise[] {});
	}
	
	public void findif(String criteria) 
	{
		cruises.stream().filter(el->el.getPrice().toString().equals(criteria));
		
	}

	
}
