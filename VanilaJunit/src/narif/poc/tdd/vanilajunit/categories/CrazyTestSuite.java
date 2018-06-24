/**
 * 
 */
package narif.poc.tdd.vanilajunit.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Najeeb
 *
 */
@RunWith(Categories.class)
@IncludeCategory(CrazyTests.class)
@SuiteClasses({CategoryTests.class,OtherTest.class})
public class CrazyTestSuite {

}
