/**
 * 
 */
package narif.poc.tdd.vanilajunit.rules.externalresource;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.rules.TestName;

/**
 * @author Najeeb
 *
 */
public class ExternalResouceTest {
	
	Resource resource;
	
	public @Rule TestName name = new TestName();
	
	public @Rule ExternalResource rule = new ExternalResource() {
		@Override
		protected void before() throws Throwable{
			resource = new Resource();
			resource.open();
			System.out.println(name.getMethodName());
		}
		
		@Override
		protected void after() {
			resource.close();
			System.out.println("\n");
		}
	};
	
	@Test
	public void test() {
		System.out.println(resource.get());
	}
	
	@Test
	public void test2() {
		System.out.println(resource.get());
	}

}
