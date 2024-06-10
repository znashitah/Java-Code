package exams.threads;

public class ThreadCountIncrement {
	private int count = 0;

	public synchronized void increment() {
		count++;

	}

	int getcount() {
		return count;
	}

	public static void main(String[] args) {
		ThreadCountIncrement tci = new ThreadCountIncrement();

		Myrunnable1 m1 = tci.new Myrunnable1();
		Myrunnable2 m2 = tci.new Myrunnable2();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(tci.getcount());
	}

	class Myrunnable1 implements Runnable {

		@Override
		public void run() {
			System.out.println("i am myrunnable1");
			for (int i = 0; i < 1000; i++) {
				increment();
			}

		}

	}

	class Myrunnable2 implements Runnable {

		@Override
		public void run() {
			System.out.println("i am myrunnable2");
			for (int i = 0; i < 1000; i++) {
				increment();
			}
		}

	}

}
