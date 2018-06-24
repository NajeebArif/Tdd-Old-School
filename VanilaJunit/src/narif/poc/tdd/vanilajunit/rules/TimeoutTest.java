package narif.poc.tdd.vanilajunit.rules;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * @author Najeeb
 *
 */
public class TimeoutTest {
	
	@Rule
	public Timeout globalTimeout = new Timeout(20, TimeUnit.MILLISECONDS);
	
	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(30);
	}
	
	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(60);
	}
}
