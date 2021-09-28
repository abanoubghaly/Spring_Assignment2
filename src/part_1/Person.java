package part_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("person")
public class Person {
	
	private Award award;
	private Expenses expenses;
	
	@Autowired
	public Person(Award award) {
		this.award = award;
	}
	
	@Autowired
	public void setExpenses(Expenses expenses) {
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
