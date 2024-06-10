package exams.threads;

public class Mythread {

	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread1 = new Thread(runnable);
		MyRunnable2 running = new MyRunnable2();
		Thread thread2 = new Thread(running);
		thread1.start();
		thread2.start();

	}

}
