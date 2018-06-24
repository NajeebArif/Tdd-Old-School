/**
 * 
 */
package narif.poc.tdd.vanilajunit.categories;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @author Najeeb
 *
 */
public class CategoryTests {
	
	@Test
	public void a() {
		fail("fail");
	}
	
	@Category(CrazyTests.class)
	@Test
	public void b() {
		
	}

}
