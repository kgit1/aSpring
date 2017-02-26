package a1.Start;

import org.aspectj.lang.JoinPoint;

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
	public String getAddress() {
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

	// aop:config point on this method
	// and will do our order to invoke before and after methods for it
	public void pointMethod() {
		System.out.println("AOP point here");
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", lasName=" + lasName + ", address=" + address + ", pet=" + pet + "]";
	}

	public void log(JoinPoint jp, String returnVal) {
		System.out.println("\nJoin Point");
		System.out.println("jp.getSignature() " + jp.getSignature());
		System.out.println("jp.jp.getSignature().getName() " + jp.getSignature().getName());
		System.out.println("jp. + jp.toString() " + jp.toString());
		System.out.println("Return value : " + returnVal);
	}
}
