package narif.poc.tdd.vanilajunit.rules;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/**
 * @author Najeeb
 *
 */
public class TempFolderAndFile {

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	@Test
	public void testTempFolder() throws IOException {
		File file = folder.newFile("myText.txt");
		File createdFolder = folder.newFolder("subfolder");
	}
}
