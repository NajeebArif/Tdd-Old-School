package narif.poc.tdd.vanilajunit.theories.paramtersupplier;

public class Adder {
	
	public Object add(Number num1, Number num2) {
		return num1.doubleValue()+num2.doubleValue();
	}
	
	public Object add(String s1, String s2) {
		return s1+s2;
	}

}
