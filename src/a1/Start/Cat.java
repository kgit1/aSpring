package a1.Start;

public class Cat implements Animal {

	String name;
	int age;

	public Cat() {
		name = "Zovie";
		age = 1;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	// before method for aop
	public void beforeMethod() {
		System.out.println("===Before Method====");
		System.out.println(this.toString());
		System.out.println(toString());
		nullMethod();
		System.out.println("=======");
	}

	// after method for aop
	public void afterMethod() {
		System.out.println("===After Method====");
		System.out.println("=======");
	}

	// method to invoke inside before method
	public void nullMethod() {
		System.out.println("Here is null method!");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
}
