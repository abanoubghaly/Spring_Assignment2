package part_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	
	private Award award1;
	private Award award2;
	private Expenses monthlyExpenses;
	private Expenses yearlyExpenses;
	
	@Autowired
	public Person(@Qualifier("supermanAward")Award award1, @Qualifier("spidermanAward")Award award2) {
		this.award1 = award1;
		this.award2 = award2;
	}

	
	@Autowired
	@Qualifier("monthlyExpenses")
	public void setMonthlyExpenses(Expenses expenses) {
		this.monthlyExpenses = expenses;
	}
	
	@Autowired
	@Qualifier("yearlyExpenses")
	public void setYearlyExpenses(Expenses expenses) {
		this.yearlyExpenses = expenses;
	}

	
	public String getAward1Name() {
		return award1.getAwardName();
	}
	
	public float getAward1PrizeMoney() {
		return award1.getAwardPizeMoney();
	}
	
	public float getMonthlyExpenses() {
		return monthlyExpenses.getExpenses();
	}
	
	public String getAward2Name() {
		return award2.getAwardName();
	}
	
	public float getAward2PrizeMoney() {
		return award2.getAwardPizeMoney();
	}
	
	public float getYearlyExpenses() {
		return yearlyExpenses.getExpenses();
	}

}
