package part_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		
		Person person = context.getBean("person", Person.class);

		System.out.println("Part A.1");

		System.out.println("Award name: " + person.getAwardName());
		System.out.println("Award prize amount: $" + person.getAwardPrizeMoney());
		System.out.println("Monthly expenses: $" + person.getExpenses());
		
		context.close();
		
	}

}
