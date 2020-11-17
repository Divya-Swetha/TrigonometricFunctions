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
		assertEquals((Math.sin(30)),(Functions.sinr(30)));
	}
	@Test
    void test4() {
		assertEquals((Math.sin(60)),(Functions.sinr(60)));
	}
	@Test
    void test5() {
		assertEquals((Math.sin(90)),(Functions.sinr(90)));
	}

	@Test
    void test6() {
		assertEquals((Math.cos(30)),(Functions.cosr(30)));
	}
	@Test
    void test7() {
		assertEquals((Math.cos(60)),(Functions.cosr(60)));
	}
	@Test
    void test8() {
		assertEquals((Math.cos(90)),(Functions.cosr(90)));
	}
	@Test
    void test9() {
		assertEquals((Math.tan(30)),(Functions.tanr(30)));
	}
	@Test
    void test10() {
		assertEquals((Math.tan(60)),(Functions.tanr(60)));
	}
	@Test
    void test11() {
		assertEquals((Math.tan(90)),(Functions.tanr(90)));
	}
}
