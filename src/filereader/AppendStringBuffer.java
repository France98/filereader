package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Read the file and append to StringBuilder
 * @author Phanuwatch Luangpradit
 *
 */
public class AppendStringBuffer implements Runnable{
	
	private String filename;
	private	String data = "";
	
	public AppendStringBuffer(String filename) {
		this.filename = filename;
	}

	/**
	 * Read the file and append to StringBuilder
	 */
	@Override
	public void run() {

		BufferedReader br = null;

		try {
			FileReader reader = new FileReader(filename);
			br = new BufferedReader(reader);
			String line;
			while ((line = br.readLine()) != null) { 
														
				data = data + line + '\n';
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		// close file
		if (br != null)
			try {
				br.close();
			} catch (IOException ex) {

			}
	}
	
	public String toString(){
		return "Read file line at a time using BufferedReader";
	}
}
