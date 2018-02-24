package filereader;

/**
 * Test the program
 * @author Phanuwatch Luangpradit
 *
 */
public class main {

	public static void main(String[] args) {
		String filename = "Alice-in-Wonderland.txt";
		TaskTimer tk = new TaskTimer();
		AppendStringTask app1 = new AppendStringTask(filename);
		AppendStringBuilder app2 = new AppendStringBuilder(filename);
		AppendStringBuffer app3 = new AppendStringBuffer(filename);
		tk.runTask(app1);
		tk.runTask(app2);
		tk.runTask(app3);
	}
}
