package lab16;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Program {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Counter counter = new Counter();

		ExecutorService executor = Executors.newFixedThreadPool(5);

		Callable<Integer> task = () -> {
			new Thread(new Worker(counter, 10000));
			return 42;
		};

		Future<Integer> future = executor.submit(task);

		System.out.println("Result = " + future.get());

		executor.shutdown();

//		Worker worker = new Worker(counter, 10000);
//		worker.run();

//		Thread t1 = new Thread(new Worker(counter, 10000));
//		Thread t2 = new Thread(new Worker(counter, 10000));
//		Thread t3 = new Thread(new Worker(counter, 10000));
//		Thread t4 = new Thread(new Worker(counter, 10000));
//		Thread t5 = new Thread(new Worker(counter, 10000));
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
//		
//		try {
//			t1.join();
//			t2.join();
//			t3.join();
//			t4.join();
//			t5.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("Final Count: " + counter.getValue());

	}

}
