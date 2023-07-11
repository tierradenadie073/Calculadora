package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlodaor.ControladorCalculadora;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.Console;

public class PantallaCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField consola;
	private ControladorCalculadora controlador ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					PantallaCalculadora frame = new PantallaCalculadora();
					frame.setVisible(true);
				}
	

	/**
	 * Create the frame.
	 */
	public PantallaCalculadora() {
		
		controlador = new ControladorCalculadora();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 596);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Haz click");
		
		btnNewButton.setBounds(335, 24, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, consola.getText());
				// esto es una prueba
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		consola = new JTextField();
		consola.setBounds(52, 24, 221, 95);
		contentPane.add(consola);
		consola.setColumns(10);
		
		JButton botonZero = new JButton("0");
		botonZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText() + "0") ;
			}
		});
		botonZero.setBounds(52, 496, 51, 50);
		contentPane.add(botonZero);
		
		
		JButton botonSiete = new JButton("7");
		botonSiete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText() + "7") ;
				
			}
		});
		botonSiete.setBounds(50, 272, 51, 50);
		contentPane.add(botonSiete);
		
		JButton botonNueve = new JButton("9");
		botonNueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText() + "9") ;
			}
		});
		botonNueve.setBounds(201, 272, 51, 50);
		contentPane.add(botonNueve);
		
		JButton botonTres = new JButton("3");
		botonTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText() + "3") ;
			}
		});
		botonTres.setBounds(201, 422, 51, 50);
		contentPane.add(botonTres);
		
		JButton botonDos = new JButton("2");
		botonDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText() + "2") ;
			}
		});
		botonDos.setBounds(127, 422, 51, 50);
		contentPane.add(botonDos);
		
		JButton botonUno = new JButton("1");
		botonUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText() + "1");
			}
		});
		botonUno.setBounds(52, 422, 51, 50);
		contentPane.add(botonUno);
		
		JButton botonCuatro = new JButton("4");
		botonCuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText() + "4") ;
			}
		});
		botonCuatro.setBounds(52, 346, 51, 50);
		contentPane.add(botonCuatro);
		
		JButton botonCinco = new JButton("5");
		botonCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText() + "5") ;
			}
		});
		botonCinco.setBounds(127, 346, 51, 50);
		contentPane.add(botonCinco);
		
		JButton botonSeis = new JButton("6");
		botonSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText() + "6") ;
			}
		});
		botonSeis.setBounds(201, 346, 51, 50);
		contentPane.add(botonSeis);
		
		JButton botonOcho = new JButton("8");
		botonOcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText() + "8") ;
			}
		});
		botonOcho.setBounds(127, 272, 51, 50);
		contentPane.add(botonOcho);
		
		JButton botonDecimales = new JButton(".");
		botonDecimales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// saber si el texto contiene un punto :
				if (!consola.getText().contains(".")) {
					if(consola.getText().isEmpty()) {
						consola.setText(consola.getText() + "0.") ;
						
						
					}else {
						
					 
					consola.setText(consola.getText() + ".") ;
					 }
				}
			}
		});
		botonDecimales.setBounds(127, 496, 51, 50);
		contentPane.add(botonDecimales);
		
		JButton botonSumar = new JButton("+");
		botonSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.setNumeroUno(Double.parseDouble(consola.getText()));
				
			
			}
		});
		botonSumar.setBounds(313, 272, 51, 50);
		contentPane.add(botonSumar);
		
		JButton botonMultiplicar = new JButton("*");
		botonMultiplicar.setBounds(313, 422, 51, 50);
		contentPane.add(botonMultiplicar);
		
		JButton botonRestar = new JButton("-");
		botonRestar.setBounds(313, 346, 51, 50);
		contentPane.add(botonRestar);
		
		JButton botonDividir = new JButton("/");
		botonDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonDividir.setBounds(313, 496, 51, 50);
		contentPane.add(botonDividir);
	}
}
