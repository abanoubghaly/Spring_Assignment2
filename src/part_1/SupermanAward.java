package part_1;

import org.springframework.stereotype.Component;

@Component
public class SupermanAward implements Award {

	@Override
	public String getAwardName() {
		return "Superman Award";
	}

	@Override
	public float getAwardPizeMoney() {
		return 100000;
	}

}
