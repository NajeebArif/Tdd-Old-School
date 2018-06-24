/**
 * 
 */
package narif.poc.tdd.vanilajunit.rules;

import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Verifier;

/**
 * @author Najeeb
 *
 */
public class VerifierRuleTest {
	
	public String errorMsg = null;
	
	@Rule
	public TestRule rule = new Verifier() {
		protected void verify() {
			assertNull("Error message should be null after each test execution.",errorMsg);
		}
	};
	
	@Test
	public void testName() {
		errorMsg = "Missed to set it back to null";
	}

}
