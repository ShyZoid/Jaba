package Calorie_Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalorieCalculator_mainTest {

	@Test
	public void getName() {
		assertEquals("Здраствуйте Вячеслав\n", CalorieCalculator_main.getName("Вячеслав"));
	}

}
