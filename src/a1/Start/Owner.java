package a1.Start;

public class Owner implements Person {

	String name;
	String lasName;
	String address;
	Animal pet;
	
	public Owner() {
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getLastName() {
		return lasName;
	}

	@Override
	public String address() {
		return address;
	}

	@Override
	public Animal getPet() {
		return pet;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setLastName(String lastName) {
		this.lasName = lastName;
	}

	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void setPet(Animal pet) {
		this.pet = pet;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", lasName=" + lasName + ", address=" + address + ", pet=" + pet + "]";
	}
	
	
}
