package part_2;

import org.springframework.stereotype.Component;

@Component
public class SpidermanAward implements Award {

	@Override
	public String getAwardName() {
		return "Spiderman award";
	}

	@Override
	public float getAwardPizeMoney() {
		return 50000;
	}

}
