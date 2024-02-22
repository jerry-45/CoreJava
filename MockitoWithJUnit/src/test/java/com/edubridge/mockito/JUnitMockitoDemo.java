package com.edubridge.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JUnitMockitoDemo {

	// Dependency Injection in the form of objects
		private Calculator cal;
		
		// For checking the condition in the main testing class using mock method
		@BeforeEach
		void setDemo() {
			cal = mock(Calculator.class);
			when(cal.addition(1, 1)).thenReturn(2);
			when(cal.subtraction(5, 4)).thenReturn(1);
			when(cal.multiplication(7, 2)).thenReturn(14);
		}
		
		@Test @DisplayName("Addition Test")
		void testAddition() {
			Assertions.assertEquals(2, cal.addition(1, 1));
			verify(cal).addition(1, 1);
		}
		
		@Test @DisplayName("Subtraction Test")
		void testSubtraction() {
			Assertions.assertEquals(1, cal.subtraction(5, 4));
			verify(cal).subtraction(5, 4);
		}
		
		@Test @DisplayName("Multiplication Test")
		void testMultiplication() {
			Assertions.assertEquals(14, cal.multiplication(7, 2));
			verify(cal).multiplication(7, 2);
		}

}
