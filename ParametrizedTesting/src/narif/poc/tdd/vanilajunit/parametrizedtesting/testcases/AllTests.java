package narif.poc.tdd.vanilajunit.parametrizedtesting.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ParametrizedTestForFact.class, ParamTestFact.class })
public class AllTests {

}
