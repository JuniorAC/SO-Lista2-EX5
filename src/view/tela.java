package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.corridaController;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;

public class tela extends JFrame {

	private JPanel contentPane;
	private JTextField vencedor;
	private JTextField perdedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela frame = new tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel carro1 = new JLabel("Carro 1");
		carro1.setForeground(Color.RED);
		carro1.setBounds(10, 39, 45, 50);
		contentPane.add(carro1);
		
		JLabel carro2 = new JLabel("Carro 2");
		carro2.setForeground(Color.BLUE);
		carro2.setBounds(10, 88, 45, 50);
		contentPane.add(carro2);
		
		vencedor = new JTextField();
		vencedor.setEditable(false);
		vencedor.setBounds(223, 184, 86, 20);
		contentPane.add(vencedor);
		vencedor.setColumns(10);
		
		perdedor = new JTextField();
		perdedor.setEditable(false);
		perdedor.setColumns(10);
		perdedor.setBounds(223, 217, 86, 20);
		contentPane.add(perdedor);
		
		JLabel lblVencedor = new JLabel("Vencedor");
		lblVencedor.setBounds(165, 184, 61, 20);
		contentPane.add(lblVencedor);
		
		JLabel lblPerdedor = new JLabel("Perdedor");
		lblPerdedor.setBounds(165, 220, 61, 20);
		contentPane.add(lblPerdedor);
		
		JButton botaoInicia = new JButton("Inicia corrida");
		botaoInicia.setBounds(10, 216, 123, 23);
		contentPane.add(botaoInicia);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 87, 414, 2);
		contentPane.add(separator);
		
		corridaController CController = new corridaController(carro1, carro2, botaoInicia, vencedor, perdedor);
		botaoInicia.addActionListener(CController);
	}
	
}
