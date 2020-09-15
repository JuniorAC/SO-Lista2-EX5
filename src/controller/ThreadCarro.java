package controller;

import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ThreadCarro extends Thread {
	Random distanciaAleatorio = new Random();
	private JButton botaoInicia;
	private JLabel carro;
	String nome = "";
	Rectangle posi��o;
	int distancia = 0;
	JTextField vencedor;
	JTextField perdedor;
	
	public ThreadCarro(JLabel carro, JButton botaoInicia, JTextField vencedor, JTextField perdedor) {

		this.carro = carro;
		this.botaoInicia = botaoInicia;
		this.vencedor = vencedor;
		this.perdedor = perdedor;
	}
	public void run() {
		botaoInicia.setEnabled(false);
		int maximo = 379;
		while (distancia < maximo ) {
			posi��o = carro.getBounds();
			distancia = posi��o.x;
			posi��o.x = posi��o.x + distanciaAleatorio.nextInt(5);
			carro.setBounds(posi��o);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(vencedor.getText().isEmpty()) {
		vencedor.setText(carro.getText());
		}
		else {
		perdedor.setText(carro.getText());
		}
		
		botaoInicia.setEnabled(true);
		
	}
	
	}

