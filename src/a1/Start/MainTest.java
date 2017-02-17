package a1.Start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

		Person p1 = ctx.getBean("john", Person.class);
		Animal a1 = ctx.getBean("doge1", Animal.class);

		System.out.println(p1.getName());
		System.out.println(a1.getName());
		System.out.println(p1.getPet().getAge());
		System.out.println(p1);
		System.out.println(a1);

		Person p2 = ctx.getBean("ariana", Person.class);
		System.out.println(p2);

		Animal a2 = ctx.getBean("doge2", Animal.class);
		System.out.println(a2);
		
		Animal a3 = ctx.getBean("doge3", Animal.class);
		System.out.println(a3);

	}
}
