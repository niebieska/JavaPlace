package pl.com.watroba.OtoRejs.models;

public class Cruise {

  long id;
  String title;
  String description;
  Integer price;
public Cruise(long id, String title, String description, Integer price) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
	this.price = price;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}

  
}
