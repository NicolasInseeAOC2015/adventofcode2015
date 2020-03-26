package aoc2019;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Day1Test {

@Test
public void myFirstTest() {
	assertTrue(true);
}
	

@Test
public void laSommeDesCarburantsDuneMasseEstLaBonneCas1() {
	
	int actual = Day1.carburantDuneMasseAvecLesCarbAdditionnels("14");
	
	assertEquals(2, actual);
	
}
@Test
public void laSommeDesCarburantsDuneMasseEstLaBonneCas2() {
	
	int actual = Day1.carburantDuneMasseAvecLesCarbAdditionnels("1969");
	
	assertEquals(966, actual);
	
}

@Test
public void laSommeDesCarburantsDuneMasseEstLaBonneCas3() {
	
	int actual = Day1.carburantDuneMasseAvecLesCarbAdditionnels("100756");
	
	assertEquals(50346, actual);
	
}

}
