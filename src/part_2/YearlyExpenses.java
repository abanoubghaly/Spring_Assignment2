package part_2;

import org.springframework.stereotype.Component;

@Component
public class YearlyExpenses implements Expenses {

	@Override
	public float getExpenses() {
		return 60000;
	}

}
