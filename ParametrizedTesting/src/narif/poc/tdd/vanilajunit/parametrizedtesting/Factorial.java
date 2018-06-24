/**
 * 
 */
package narif.poc.tdd.vanilajunit.parametrizedtesting;

/**
 * @author Najeeb
 *
 */
public class Factorial {

	public Long doFactorize(Long l) {
		validateInput(l);
		Long result = 1L;
		if(l==0||l==1)
			return result;
		while(l>=1L) 
			result*=l--;
		return result;
	}

	/**
	 * @param l
	 */
	private void validateInput(Long l) {
		if(l==null)
			throw new InvalidInput("Numbers should not be null.");
		else if(l<0)
			throw new InvalidInput("Numbers should be greater than 0.");
	}

}
