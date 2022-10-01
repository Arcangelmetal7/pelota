package graficos;

public class Hilo extends Thread {

	Lamina miLamina = new Lamina();

	public Hilo(Lamina Lamina) {
		this.miLamina = Lamina;

	}

	public void run() {
		while (true) {
			miLamina.repaint();
		}
	}

}
