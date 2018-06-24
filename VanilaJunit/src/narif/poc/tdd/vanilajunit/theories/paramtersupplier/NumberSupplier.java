/**
 * 
 */
package narif.poc.tdd.vanilajunit.theories.paramtersupplier;

import java.util.ArrayList;
import java.util.List;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

/**
 * @author Najeeb
 *
 */
public class NumberSupplier extends ParameterSupplier {

	/* (non-Javadoc)
	 * @see org.junit.experimental.theories.ParameterSupplier#getValueSources(org.junit.experimental.theories.ParameterSignature)
	 */
	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) throws Throwable {
		List<PotentialAssignment> list = new ArrayList<>();
		list.add(PotentialAssignment.forValue("long", 2L));
		list.add(PotentialAssignment.forValue("float", 5.00f));
		list.add(PotentialAssignment.forValue("double", 89d));
		return list;
	}

}
