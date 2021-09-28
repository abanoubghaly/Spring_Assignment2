package part_b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("person")
public class Person {
	
	private Award award;
	private Expenses expenses;
	
	@Autowired
	public Person(Award award, Expenses expenses) {
		this.award = award;
		this.expenses = expenses;

	}
	
	public String getAwardName() {
		return award.getAwardName();
	}
	
	
	public float getAwardPrizeMoney() {
		return award.getAwardPizeMoney();
	}
	
	public float getExpenses() {
		return expenses.getExpenses();
	}
	

}
