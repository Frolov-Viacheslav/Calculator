package Viacheslav;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions;
import java.util.InputMismatchException;


public class MainTest
{
        @Test
	@DisplayName("100 + 20 = 120")
	void addTwoNumbers() {
		Main calculator = new Main();
		assertEquals(120, calculator.add(100, 20), "100 + 20 should equal 120");
	}
        @Test
        @DisplayName("100 - 20 = 80")
        void subTwoNumbers() {
                Main calculator = new Main();
                assertEquals(80, calculator.sub(100, 20), "100 - 20 should equal 80");
        }
        @Test
        @DisplayName("100 * 20 = 2000")
        void multTwoNumbers() {
                Main calculator = new Main();
                assertEquals(2000, calculator.mult(100, 20), "100 * 20 should equal 2000");
        }
        @Test
        @DisplayName("100 / 20 = 5")
        void divTwoNumbers() {
                Main calculator = new Main();
                assertEquals(5, calculator.div(100, 20), "100 / 20 should equal 5");
        }
        @Test
        void testExpectedException() {
                Main calculator = new Main();
                Assertions.assertThrows(ArithmeticException.class, () -> {
                calculator.div(7, 0);
        });
        }
}
