/**
 * 
 */
package narif.poc.tdd.vanilajunit.rules;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * @author Najeeb
 *
 */
public class ErrorCollectorTest {
	
	@Rule
	public ErrorCollector collector = new ErrorCollector();
	
	@Test
	public void test() {
		collector.checkThat("a", equalTo("b"));
		collector.checkThat(1, is(2));
		collector.checkThat(true, is(false));
	}
	

}
