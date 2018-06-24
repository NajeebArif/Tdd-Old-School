/**
 * 
 */
package narif.poc.tdd.vanilajunit.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import narif.poc.tdd.vanilajunit.parametrizedtesting.Factorial;
import narif.poc.tdd.vanilajunit.parametrizedtesting.InvalidInput;

/**
 * @author Najeeb
 *
 */
public class ExpectedExceptionTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void throwNoException() {
		
	}
	
	@Test
	public void expectNullPointerException() {
		thrown.expect(NullPointerException.class);
		throw new NullPointerException();
	}
	
	@Test
	public void expectInvalidInputExpcetion() {
		thrown.expect(InvalidInput.class);
		thrown.expectMessage("Numbers should not be null.");
		(new Factorial()).doFactorize(null);
	}

}
