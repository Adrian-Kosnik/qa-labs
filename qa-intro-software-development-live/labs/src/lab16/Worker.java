package lab16;

public class Worker implements Runnable {
	
	private Counter counter;
	private int iterations;
	
	public Worker(Counter counter, int iterations) {
		this.counter = counter;
		this.iterations = iterations;
	}

	@Override
	public void run() {
		for(int i = 0; i < iterations; i++) {
			counter.increment();
		}
		System.out.println(counter.getValue());
	}

}
