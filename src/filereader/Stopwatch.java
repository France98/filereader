package filereader;

/**
 * Compute elapsed time between a start and stop time
 * @author Phanuwatch Luangpradit
 *
 */
public class Stopwatch {
	
	private static final double NANOSECOND = 1.0E-9;
	private long startTime;
	private long stopTime;
	private boolean run;
	private long elapsed;
	
	/**
	 * Constructor of stopwatch
	 */
	public Stopwatch(){
		run = false;
	}

	/**
	 * reset the stopwatch and start if stopwatch is not running. 
	 * if the stopwatch is already running then start does nothing
	 */
	public void start(){
		if(run){
			return;
		}else {
			run = true;			
			this.startTime = System.nanoTime();
		}
	}
	
	/**
	 * stop the stopwatch.
	 * If the stopwatch is already stopped, then stop does nothing
	 */
	public void stop(){
		if(!run){
			return;
		}else{
			run = false;
			this.stopTime = System.nanoTime();
			elapsed = stopTime - startTime;
		}
	}
	
	/**
	 * Tell that the program is running or not
	 * @return true if the stopwatch is running
	 * 		   false if stopwatch is stopped
	 */
	public boolean isRunning(){
		return run;
	}
	
	/**
	 * return elapsed time in seconds
	 * @return elapsed time in seconds
	 */
	public double getElapsed(){
		double time = System.nanoTime();
		if(run){
			return (time - startTime) * NANOSECOND;
		}else{
			return elapsed * NANOSECOND;
		}
	}
}
