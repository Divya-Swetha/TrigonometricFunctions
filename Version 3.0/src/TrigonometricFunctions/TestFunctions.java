package TrigonometricFunctions;
import java.math.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFunctions {

	@Test
	void test1() {
		assertEquals((Math.pow(2,3)), (Functions.power(2,3)));	
		}
	@Test
	void test2() {
		assertEquals(720, (Functions.factorial(6)));	
		}
	@Test
    void test3() {
		assertEquals(decimal(Math.sin(30),7),decimal(Functions.sinr(30),7));
	}
	@Test
    void test4() {
		assertEquals(decimal(Math.sin(60),7),decimal(Functions.sinr(60),7));
	}
	@Test
    void test5() {
		assertEquals(decimal(Math.sin(90),7),decimal(Functions.sinr(90),7));
	}
	@Test
    void test6() {
		assertEquals(decimal(Math.sin(180),7),decimal(Functions.sinr(180),7));
	}
	@Test
    void test7() {
		assertEquals(decimal(Math.sin(360),7),decimal(Functions.sinr(360),7));
	}

	@Test
    void test8() {
		assertEquals(decimal(Math.cos(30),7),decimal(Functions.cosr(30),7));
	}
	@Test
    void test9() {
		assertEquals(decimal(Math.cos(60),7),decimal(Functions.cosr(60),7));
	}
	@Test
    void test10() {
		assertEquals(decimal(Math.cos(90),7),decimal(Functions.cosr(90),7));
	}
	@Test
    void test11() {
		assertEquals(decimal(Math.cos(180),7),decimal(Functions.cosr(180),7));
	}
	@Test
    void test12() {
		assertEquals(decimal(Math.cos(360),7),decimal(Functions.cosr(360),7));
	}

	@Test
    void test13() {
		assertEquals(decimal(Math.tan(30),7),decimal(Functions.tanr(30),7));
	}
	@Test
    void test14() {
		assertEquals(decimal(Math.tan(60),7),decimal(Functions.tanr(60),7));
	}
	@Test
    void test15() {
		assertEquals(decimal(Math.tan(90),7),decimal(Functions.tanr(90),7));
	}
	@Test
	void test16() {
		assertEquals(decimal(Math.tan(180),7), decimal(Functions.tanr(180),7));
	}	
	@Test
	void test17() {
		assertEquals(decimal(Math.tan(360),7), decimal(Functions.tanr(360),7));
	}	
	
	private static BigDecimal decimal(double x,int numberofDecimals)
	{
	    if ( x > 0) {
	        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
	    } else {
	        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
	    }
	}
}
