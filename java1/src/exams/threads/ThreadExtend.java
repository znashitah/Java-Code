package exams.threads;

public class ThreadExtend extends Thread {

	public static void main(String[] args) {
		ThreadExtend myThread = new ThreadExtend();
		myThread.start();

	}

	@Override
	public void run() {
		System.out.println("i am new thread via extends keyword from ThreadExtend class");

	}

}
