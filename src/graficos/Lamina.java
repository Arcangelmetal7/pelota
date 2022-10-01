package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Lamina extends JPanel {

	Pelota miPelota = new Pelota(0, 0);

	public Lamina() {
		setBackground(Color.GREEN);

	}

	public void paintComponent(Graphics a) {
		super.paintComponent(a);
		Graphics2D a2 = (Graphics2D) a;
		a2.setColor(Color.BLUE);
		dibujar(a2);
		actualizar();
	}

	public void dibujar(Graphics2D g) {
		g.fill(miPelota.getPelota());

	}

	public void actualizar() {
		miPelota.mover(getBounds());

	}
}
