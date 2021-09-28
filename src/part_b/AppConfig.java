package part_b;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Person person() {
		return new Person(award(), monthlyExpenses());
	}
	
	@Bean
	public Expenses monthlyExpenses() {
		return new MonthlyExpenses();
	}
	
	@Bean
	public Award award() {
		return new SupermanAward();
	}
	
}
