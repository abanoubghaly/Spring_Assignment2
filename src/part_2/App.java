package part_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		Person person = context.getBean("person", Person.class);

		System.out.println("Part A.2");
		System.out.println("Award 1 name: " + person.getAward1Name());
		System.out.println("Award 1 prize amount: $" + person.getAward1PrizeMoney());
		System.out.println("Award 2 name: " + person.getAward2Name());
		System.out.println("Award 2 prize amount: $" + person.getAward2PrizeMoney());
		System.out.println("Monthly expenses: $" + person.getMonthlyExpenses());
		System.out.println("Yearly expenses: $" + person.getYearlyExpenses());

		
		context.close();

		
	}

}
