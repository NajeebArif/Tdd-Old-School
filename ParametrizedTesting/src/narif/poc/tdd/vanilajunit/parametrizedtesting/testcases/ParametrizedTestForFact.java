/**
 * 
 */
package narif.poc.tdd.vanilajunit.parametrizedtesting.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import narif.poc.tdd.vanilajunit.parametrizedtesting.Factorial;

/**
 * @author Najeeb
 *
 */
@RunWith(Parameterized.class)
public class ParametrizedTestForFact {
	
	@Parameter(0)
	public Long input;
	@Parameter(1)
	public Long expectedOutut;
	
	@Parameters(name="{index}: doFactorial({0}) = {1}")
	public static Collection<Object[]> factorialData(){
		return Arrays.asList(new Object[][] {
			{0L,1L},
			{1l,1l},
			{2l,2l},
			{3l,6l},
			{4l,24l},
			{5l,120l},
			{6l,720l}
		});
	}

	@Test
	public void for_the_above_given_value_factorial_should_return() {
		Factorial fact = new Factorial();
		assertEquals(fact.doFactorize(input), expectedOutut);
	}

}
