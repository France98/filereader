package filereader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Read the file and append line to String
 * @author Phanuwatch Luangpradit
 *
 */
public class AppendStringBuilder implements Runnable {
	
	private String filename;
	private StringBuilder data;
	
	public AppendStringBuilder(String filename) {
		this.filename =filename;
	}

	/**
	 * Read the file and append line to String
	 */
	@Override
	public void run() {
		InputStream in = null;

		data = new StringBuilder();
		try {
			// open the file
			in = new FileInputStream(filename);
			// read as characters
			InputStreamReader reader = new InputStreamReader(in);
			// read the file
			int c;
			while (true) { // while((c=reader.read()) >= 0)
				c = reader.read();
				if (c < 0)
					break;
				data = data.append((char) c);
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		// close file
		if (in != null)
			try {
				in.close();
			} catch (IOException ex) {

			}
	}

	public String toString(){
		return "Read file 1-char at a time to StringBuilder";
	}
}
