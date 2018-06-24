/**
 * 
 */
package narif.poc.tdd.vanilajunit.parametrizedtesting.testcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import narif.poc.tdd.vanilajunit.parametrizedtesting.Factorial;
import narif.poc.tdd.vanilajunit.parametrizedtesting.InvalidInput;

/**
 * @author Najeeb
 *
 */
public class ParamTestFact {
	
	Factorial fact;
	
	@Before
	public void init() {
		fact = new Factorial();
	}

	@Test
	public void factorial_instance_exists() {
		assertNotNull(fact);
	}
	
	@Test
	public void factorial_method_takes_a_long_input() {
		Long number = 1l;
		assertTrue(number.getClass().isInstance(99L));
		fact.doFactorize(number);
	}
	
	@Test
	public void factorial_method_returns_a_non_null_value() {
		Long result = fact.doFactorize(1L);
		assertNotNull(result);
	}
	
	@Test(expected=InvalidInput.class)
	public void factorial_throws_exception_on_sending_negative_values() {
		fact.doFactorize(-1L);
	}
	
	@Test(expected = InvalidInput.class)
	public void throws_invalid_exp_for_Null() {
		fact.doFactorize(null);
	}
	
}
