package desgin_patterns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Ensure class is having only once instance:
public class SingeltonPattern {

	private static SingeltonPattern instance;

	// make the constructor private:
	private SingeltonPattern() {

	}

	public static SingeltonPattern getInstance() {
		if (instance == null) {
			synchronized (SingeltonPattern.class) {
				if (instance == null) {
					instance = new SingeltonPattern();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		ExecutorService exService = Executors.newFixedThreadPool(5);

		for (int i = 1; i <= 5; i++) {

			exService.submit(() -> {
				SingeltonPattern s1 = SingeltonPattern.getInstance();
				System.out.println(s1.hashCode());
				//return s1;
			});

		}

		exService.shutdown();
	}

}
