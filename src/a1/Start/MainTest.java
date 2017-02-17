package a1.Start;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("cityContext.xml");

		Person p1 = ctx.getBean("habs", Person.class);
		Animal a1 = ctx.getBean("doge1", Animal.class);

		System.out.println(p1.getName());
		System.out.println(a1.getName());
		System.out.println(p1.getPet().getAge());
		System.out.println(p1);
		System.out.println(a1);

		Person p2 = ctx.getBean("john", Person.class);
		System.out.println(p2);

		Animal a2 = ctx.getBean("doge2", Animal.class);
		System.out.println(a2);

		Animal a3 = ctx.getBean("doge3", Animal.class);
		System.out.println(a3);

		Person p3 = ctx.getBean("ariana", Person.class);
		System.out.println(p3);

		Person p4 = ctx.getBean("aramco", Person.class);
		System.out.println(p4);

		Person p5 = ctx.getBean("aramco1", Person.class);
		System.out.println(p5);

		List<City> list = ctx1.getBean("cities", List.class);
		System.out.println(list.toString());

		City c1 = ctx1.getBean("choosenCity1", City.class);
		City c2 = ctx1.getBean("choosenCity2", City.class);
		City c3 = ctx1.getBean("choosenCity3", City.class);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}
}
