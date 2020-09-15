package controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class corridaController implements ActionListener  {
	
	private JButton botaoInicia;
	private JLabel carro1;
	private JLabel carro2;
	private JTextField vencedor;
	private JTextField perdedor;
	public corridaController(JLabel carro1, JLabel carro2, JButton botaoInicia, JTextField vencedor, JTextField perdedor) {
		this.carro1 = carro1;
		this.carro2 = carro2;
		this.botaoInicia = botaoInicia;
		this.vencedor = vencedor;
		this.perdedor = perdedor;
				
	}
 private void acaoCarro() {
	 botaoInicia.setEnabled(false);
	 ThreadCarro TCarro1 = new ThreadCarro (carro1, botaoInicia, vencedor, perdedor);
	 ThreadCarro TCarro2 = new ThreadCarro  (carro2, botaoInicia, vencedor, perdedor);
	 TCarro1.start();
	 TCarro2.start();
 }


public void actionPerformed(ActionEvent arg0) {
	 acaoCarro();
	
}

}
