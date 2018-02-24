package filereader;

/**
 * Compute and print the elapsed time for any task
 * @author Phanuwatch Luangpradit
 *
 */
public class TaskTimer {

	/**
	 * Run and compute the program
	 * @param run
	 */
	public void runTask(Runnable run){
		Stopwatch sw = new Stopwatch();
		System.out.println(run.toString());
		sw.start();
		run.run();
		sw.stop();
		System.out.printf("Read file in %.6f sec.\n" , sw.getElapsed());
	}
}
