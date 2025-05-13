package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.entornos.SusanaVillenaMartin.clases.algoritmos;

class testAlgortimos {
	static algoritmos a;

	@BeforeAll
	static void setup() {
		a = new algoritmos() {};
	}
	
	@Test
	void testFibonacci() {
		assertEquals(5, a.fibonacci(5));
		assertEquals(1, a.fibonacci(2));
		assertEquals(55, a.fibonacci(10));
	}
	
	@Test
	void testfactorial() {
		assertEquals(120, a.factorial(5));
		assertEquals(24, a.factorial(4));
		assertEquals(5040, a.factorial(7));
	}
	
	@Test
	void testPrimo() {
		assertEquals(true, a.primo(2));
		assertEquals(true, a.primo(11));
		assertEquals(false, a.primo(9));
	}
	
	@Test
	void testFibonacciNegativo() {
		assertThrows(IllegalArgumentException.class,() -> {a.fibonacci(-1);});
	}
	
	@Test
	void testPrimosNegativo() {
		assertThrows(IllegalArgumentException.class,() -> {a.primo(-1);});
	}
	
	@Test
	void testFactorialNegativo() {
		assertThrows(IllegalArgumentException.class,() -> {a.factorial(-1);});
	}


}
