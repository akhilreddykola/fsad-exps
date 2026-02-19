package klu.Spring_DI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	String Street,city;
	

	public Address(String street, String city) {
			super();
			
			//@Value("klu");
			Street = street;
		//	@Value("akhil");
			this.city = city;
		}

	public Address() {
		
	}
	

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + "]";
	}
	
	

}
