package narif.poc.tdd.vanilajunit.theories.paramtersupplier;

import static org.junit.Assert.assertEquals;

import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class ExternalTheoryTest {
	
	
	@Theory
	public void addsNumbers(@ParametersSuppliedBy(NumberSupplier.class) Number num1,
			@ParametersSuppliedBy(NumberSupplier.class) Number num2) {
		Adder adder = new Adder();
		double expectedVal = num1.doubleValue()+num2.doubleValue();
		assertEquals( expectedVal,adder.add(num1, num2));
	}
}
