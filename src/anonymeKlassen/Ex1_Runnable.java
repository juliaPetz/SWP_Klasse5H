package anonymeKlassen;

public class Ex1_Runnable {

	public static void main(String[] args) {
		// anonyme innere Klasse anlegen
		Runnable task = new Runnable() {
			public void run() {
				for(int i = 1; i <= 5; i++) {
					System.out.println("Zahl: " + i);
					try {
						// Ausführungsast = Thread
						Thread.sleep(500);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}; // Ende der anonymen Klasse
		// Thread anlegen
		Thread thread = new Thread(task);
		// Thread starten
		thread.start();
	}

}
