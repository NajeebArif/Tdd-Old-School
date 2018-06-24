package narif.poc.tdd.vanilajunit.theories;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTest {
	
	@DataPoint public static String firstName = "Najeeb";
	@DataPoint public static String lastName = "Arif";
	
	@DataPoints public static char[] chars = new char[] {'A','B','C'};
	
	@Theory
	public void sanity(String pName) {
		System.out.println("Sanity check for "+pName);
	}
	
	@Theory
	public void sanityForFullName(String fName, String lName) {
		System.out.println("Sanity check for "+fName+" "+lName);
	}
	
	@Theory
	public void sanityForChars(char a, char b) {
		System.out.println(a+" "+b);
	}
}
