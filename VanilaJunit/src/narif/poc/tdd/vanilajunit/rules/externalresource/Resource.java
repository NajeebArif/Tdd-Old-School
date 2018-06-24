package narif.poc.tdd.vanilajunit.rules.externalresource;

public class Resource {
	
	public void open() {
		System.out.println("Open");
	}
	
	public void close() {
		System.out.println("Close");
	}
	
	public Double get() {
		return Math.random();
	}

}
