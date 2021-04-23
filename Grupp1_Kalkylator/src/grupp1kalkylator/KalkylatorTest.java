package grupp1kalkylator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class KalkylatorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	// TEST SCENARIO / TESTSPEC
		// 1 Addera med två parameterar
		// 2 Addera med flera parametrar - Flera uträkningar med två tal  - Addera ihop flera summor till ett resultat
		// 3 Subtrahera med två parametrar
		// 4 Multipicera med två parametrar
		// 5 Multiplicera med MAXVALUE - if statement
		// 6 Dividera med två parametrar
		// 7 Dividera med 0 - if statement
		
		// TEST SCENARIO / SPEC [NY FUNKTION]
		// 1 Räkna ut procent tal av tiotal
		// 2 Räkna ut procent 
		// 3 Undantag för att räkna ut procent bara 1%-99% rabatt if statements
		
		@Test
		void Add_TwoNumbers_ReturnSum() 
		{
			// Arrange
			double expected = 5;
			// Action
			double actual = Kalkylator.Add(3, 2);
			// Assert
			assertEquals(expected, actual);
			
		}
	

		@Test
		void Sub_TwoNumbers_ReturnSum() 
		{
			double expected = 11;
			double actual = Kalkylator.Sub(17, 6);
			assertEquals(expected, actual);
		}
		
		@Test
		void Multi_TwoNumbers_ReturnSum() 
		{
			double expected = 10;
			double actual = Kalkylator.Multi(5, 2);
			assertEquals(expected, actual);
		}
		
		@Test
		void Multi_TwoNumbers_ReturnMaxValue()
		{
			
			//-----Failed TestCase-----
			//double expected = Double.MAX_VALUE; 
			// (if statement return -1) PASSED
			double expected = -1;
			double actual = Kalkylator.Multi(Double.MAX_VALUE, Double.MAX_VALUE);		
			assertEquals(expected, actual);
		}

		@Test 
		void Div_TwoNumbers_ReturnSum()
		{
			double expected = 50;
			double actual = Kalkylator.Div(100, 2);
			assertEquals(expected, actual);
		}
		
		@Test
		void Div_WithZero_ReturnZero()
		{
			double expected = 0; // expected = ? / actual = infinity
			double actual = Kalkylator.Div(2, 0);
			assertEquals(expected, actual);
		}
		
		@Test
		void Discount_Procent_Calculate() {
			
			
			double expected = -40;
			double actual = Kalkylator.Procent(200, 20);
			assertEquals(expected, actual);
			
			// skriver ut rabatt
			
		}
		
		@Test
		void Procent_TwoValue_ReturnDiscount() 
		{
			double expected = 160;
			double actual = Kalkylator.Discount(200, 20);
			assertEquals(expected, actual);
			
			// skriver ut nytt pris 
		}
		@Test
		void Procent_OverHundred_ReturnFalse() 
		{
			double expected = 0; // fail test, refactor kod
			double actual = Kalkylator.Procent(200, 120);
			assertEquals(expected, actual);
		}
		
		@Test
		void Discount_OverHundred_ReturnFalse() 
		{
			double expected = 0;
			double actual = Kalkylator.Discount(200, 120);
			assertEquals(expected, actual);
		}
	
}
