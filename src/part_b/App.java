package part_b;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person person = context.getBean("person", Person.class);

		System.out.println("Part B");

		System.out.println("Award name: " + person.getAwardName());
		System.out.println("Award prize amount: $" + person.getAwardPrizeMoney());
		System.out.println("Monthly expenses: $" + person.getExpenses());
		
		context.close();
		
	}

}
