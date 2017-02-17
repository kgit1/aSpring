package a1.Start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

		Person p = ctx.getBean("john", Person.class);
		Animal a = ctx.getBean("doge", Animal.class);

		System.out.println(p.getName());
		System.out.println(a.getName());
		System.out.println(p.getPet().getAge());
		System.out.println(p);
		System.out.println(a);

	}
}
