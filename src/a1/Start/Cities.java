package a1.Start;

import java.util.List;

public class Cities {
	List<City> cities;

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Cities [cities=" + cities + "]";
	}
}
