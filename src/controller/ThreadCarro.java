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
	Rectangle posição;
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
			posição = carro.getBounds();
			distancia = posição.x;
			posição.x = posição.x + distanciaAleatorio.nextInt(5);
			carro.setBounds(posição);
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

