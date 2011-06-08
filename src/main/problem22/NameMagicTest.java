package problem22;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;


public class NameMagicTest {
	private static final String DICK = "Dick";
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	private static final String TOM = "\"Tom\"";
	private static final String FAKE_FILE_NAME = "fake.txt";
	private File realFile;
	private File fakeFile;
	
	@Before
	public void setUp() throws IOException{
		folder.newFile(FAKE_FILE_NAME);
		fakeFile = new File(FAKE_FILE_NAME);
		realFile = new File("src/resources/names.txt");
	}
	
	@Test
	public void canLoadFileIntoNameMagic() throws Exception {
		writeToFile(fakeFile, asList(TOM));
		assertThat(new NameMagic(fakeFile).sum(), is(20+15+13));
	}
	
	@Test
	public void canLoadFileWithColinIntoNameMagic() throws Exception {
		writeToFile(fakeFile, asList("COLIN"));
		assertThat(new NameMagic(fakeFile).sum(), is(53));
	}

	@Test
	public void canAnotherLoadFileIntoNameMagic() throws Exception {
		writeToFile(fakeFile, asList(TOM,DICK));
		assertThat(new NameMagic(fakeFile).sum(), is(27 + 96));
	}


	@Test
	public void canRealFileIntoNameMagic() throws Exception {
		assertThat(new NameMagic(realFile).sum(), is(871198282));
	}

	private void writeToFile(File fakeFile2, List<String> names) throws Exception {
		BufferedWriter writer = new BufferedWriter(new FileWriter(fakeFile));
		for(String name:names){
			writer.write(name);
			if(name != names.get(names.size()-1)){
				writer.write(",");
			}
		}
		writer.flush();
		writer.close();
	}
	
}
