package klu.SpringBoot_MVC_Annotations;

public class customer {
	String name;
	String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "customer [name=" + name + ", location=" + location + "]";
	}
	public customer(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	

}
