package graficos;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	private final int ANCHO = 640, ALTO = 480;
	private final String NOMBRE = "Tenis";
	public Lamina lamina1 = new Lamina();
	private Hilo miHilo;

	public Ventana() {
		setTitle(NOMBRE);
		setSize(ANCHO, ALTO);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		add(lamina1);
		miHilo = new Hilo(lamina1);
		miHilo.start();

	}

}
