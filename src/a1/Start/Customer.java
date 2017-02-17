package a1.Start;

import java.util.ArrayList;

public class Customer {

	ArrayList<City> cities;

	public Customer(ArrayList<City> cities) {
		super();
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Customer [cities=" + cities + "]";
	}
	
	

}
