package anonymeKlassen;

public class Ex3_Timer {

	public static void main(String[] args) {
		Thread countdownThread = new Thread(new Runnable() {
			public void run() {
				for(int i = 10; i >= 1; i--) {
					System.out.println("Countdown: " + i);
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {
						System.out.println("Der Countdown wurde abgebrochen.");
					}
				}
				System.out.println("Countdown abgeschlossen!");
			}
		});
		countdownThread.start();
	}

}
