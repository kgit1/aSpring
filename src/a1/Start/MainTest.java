package a1.Start;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("context1.xml");
		ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("context2.xml");
		ClassPathXmlApplicationContext ctx3 = new ClassPathXmlApplicationContext("context3.xml");
		ClassPathXmlApplicationContext ctx4 = new ClassPathXmlApplicationContext("cityContext.xml");

		Person p1 = ctx.getBean("habs", Person.class);
		Animal a1 = ctx.getBean("doge1", Animal.class);

		System.out.println("\n Context");
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

		System.out.println("\n Context Cities");

		List<City> list = ctx4.getBean("cities", List.class);
		System.out.println(list.toString());

		City c1 = ctx4.getBean("choosenCity1", City.class);
		City c2 = ctx4.getBean("choosenCity2", City.class);
		City c3 = ctx4.getBean("choosenCity3", City.class);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		List<City> cities = ctx4.getBean("test", List.class);

		System.out.println(cities);

		// before, replace, and after method here
		System.out.println("\n Context1");
		Person owner = ctx1.getBean("aramco", Person.class);
		owner.pointMethod();

		// bean post processor changing symbols in all String fields of object
		// bean post processor which invokes method changer
		// to change all "o" and "s" in all strings of object to "k"
		p1 = ctx2.getBean("habs", Person.class);
		System.out.println(p1);
		System.out.println(p1.getName());
		System.out.println(p1.getLastName());
		
		MindReader mag = ctx3.getBean("magik",MindReader.class);
		Thinker vol = ctx3.getBean("volunteer", Thinker.class);
		vol.thinkOfSomething("Queen of Spades");
//		System.out.println(mag.getThoughts());

	}
}
