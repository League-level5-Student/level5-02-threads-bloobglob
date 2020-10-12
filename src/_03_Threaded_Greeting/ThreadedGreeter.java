package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	int number;
	ThreadedGreeter(int a) {
		number = a;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread #" + number);
		if(number <= 50) {
			Thread t = new Thread(()->{
				ThreadedGreeter tg = new ThreadedGreeter(number+1);
				});
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
