package wordle;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Interfaz {

	private JFrame frame;
	private JTextField letra1;
	private JTextField letra2;
	private JTextField letra3;
	private JTextField letra4;
	private JTextField letra5;
	private String palabra;
	private Wordle palabraWordle;
	private JLabel lblTitulo;
	private JTextField letra1SegundoIntento;
	private JTextField letra2SegundoIntento;
	private JTextField letra3SegundoIntento;
	private JTextField letra4SegundoIntento;
	private JTextField letra5SegundoIntento;
	private JTextField letra1TercerIntento;
	private JTextField letra2TercerIntento;
	private JTextField letra3TercerIntento;
	private JTextField letra4TercerIntento;
	private JTextField letra5TercerIntento;
	private JTextField letra1CuartoIntento;
	private JTextField letra2CuartoIntento;
	private JTextField letra3CuartoIntento;
	private JTextField letra4CuartoIntento;
	private JTextField letra5CuartoIntento;
	private JTextField letra1QuintoIntento;
	private JTextField letra2QuintoIntento;
	private JTextField letra3QuintoIntento;
	private JTextField letra4QuintoIntento;
	private JTextField letra5QuintoIntento;
	private JTextField letra1SextoIntento;
	private JTextField letra2SextoIntento;
	private JTextField letra3SextoIntento;
	private JTextField letra4SextoIntento;
	private JTextField letra5SextoIntento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String [] listaDePalabras = {"bueno","barco","mouse","bazar","papel","pared","jarra","gorro","lapiz","color",
				"reloj","llama","perro","angel","letra","fecha","abeja","araña","burro","pulpo"};
		palabraWordle= new Wordle(listaDePalabras);
		palabra="";
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 326, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		letra1 = new JTextField();		
		letra1.setBounds(24, 80, 40, 35);
		frame.getContentPane().add(letra1);
		letra1.setColumns(10);
		letra1.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra2.grabFocus();
				letra2.setEditable(true);
			}
		});
			
		letra2 = new JTextField();	
		letra2.setColumns(10);
		letra2.setBounds(73, 80, 40, 35);
		frame.getContentPane().add(letra2);
		letra2.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra3.grabFocus();
				letra3.setEditable(true);
			}
		});
		
		letra3 = new JTextField();
		letra3.setColumns(10);
		letra3.setBounds(123, 80, 40, 35);
		frame.getContentPane().add(letra3);		
		letra3.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra4.grabFocus();
				letra4.setEditable(true);
			}
		});
		
		letra4 = new JTextField();
		letra4.setColumns(10);
		letra4.setBounds(172, 80, 40, 35);
		frame.getContentPane().add(letra4);
		letra4.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra5.grabFocus();
			}
		});
		
		letra5 = new JTextField();
		letra5.setColumns(10);
		letra5.setBounds(222, 80, 40, 35);
		frame.getContentPane().add(letra5);
		letra5.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
					letra1SegundoIntento.grabFocus();
			}
		});
		
		letra1SegundoIntento = new JTextField();
		letra1SegundoIntento.setColumns(10);
		letra1SegundoIntento.setBounds(24, 139, 40, 35);
		frame.getContentPane().add(letra1SegundoIntento);
		letra1SegundoIntento.setEditable(false);
		letra1SegundoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra2SegundoIntento.grabFocus();
			}
		});
		
		letra2SegundoIntento = new JTextField();
		letra2SegundoIntento.setColumns(10);
		letra2SegundoIntento.setBounds(73, 139, 40, 35);
		frame.getContentPane().add(letra2SegundoIntento);
		letra2SegundoIntento.setEditable(false);
		letra2SegundoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra3SegundoIntento.grabFocus();
			}
		});
		
		letra3SegundoIntento = new JTextField();
		letra3SegundoIntento.setColumns(10);
		letra3SegundoIntento.setBounds(123, 139, 40, 35);
		frame.getContentPane().add(letra3SegundoIntento);
		letra3SegundoIntento.setEditable(false);
		letra3SegundoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra4SegundoIntento.grabFocus();
			}
		});
		
		letra4SegundoIntento = new JTextField();
		letra4SegundoIntento.setColumns(10);
		letra4SegundoIntento.setBounds(172, 139, 40, 35);
		frame.getContentPane().add(letra4SegundoIntento);
		letra4SegundoIntento.setEditable(false);
		letra4SegundoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra5SegundoIntento.grabFocus();
			}
		});
		
		letra5SegundoIntento = new JTextField();
		letra5SegundoIntento.setColumns(10);
		letra5SegundoIntento.setBounds(222, 139, 40, 35);
		frame.getContentPane().add(letra5SegundoIntento);
		letra5SegundoIntento.setEditable(false);
		letra5SegundoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra1TercerIntento.grabFocus();
			}
		});
		
		letra1TercerIntento = new JTextField();
		letra1TercerIntento.setColumns(10);
		letra1TercerIntento.setBounds(24, 195, 40, 35);
		frame.getContentPane().add(letra1TercerIntento);
		letra1TercerIntento.setEditable(false);
		letra1TercerIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra2TercerIntento.grabFocus();
			}
		});
		
		letra2TercerIntento = new JTextField();
		letra2TercerIntento.setColumns(10);
		letra2TercerIntento.setBounds(73, 195, 40, 35);
		frame.getContentPane().add(letra2TercerIntento);
		letra2TercerIntento.setEditable(false);
		letra2TercerIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra3TercerIntento.grabFocus();
			}
		});
		
		letra3TercerIntento = new JTextField();
		letra3TercerIntento.setColumns(10);
		letra3TercerIntento.setBounds(123, 195, 40, 35);
		frame.getContentPane().add(letra3TercerIntento);
		letra3TercerIntento.setEditable(false);
		letra3TercerIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra4TercerIntento.grabFocus();
			}
		});
		
		letra4TercerIntento = new JTextField();
		letra4TercerIntento.setColumns(10);
		letra4TercerIntento.setBounds(172, 195, 40, 35);
		frame.getContentPane().add(letra4TercerIntento);
		letra4TercerIntento.setEditable(false);
		letra4TercerIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra5TercerIntento.grabFocus();
			}
		});
		
		letra5TercerIntento = new JTextField();
		letra5TercerIntento.setColumns(10);
		letra5TercerIntento.setBounds(222, 195, 40, 35);
		frame.getContentPane().add(letra5TercerIntento);
		letra5TercerIntento.setEditable(false);
		letra5TercerIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra1CuartoIntento.grabFocus();
			}
		});
		
		letra1CuartoIntento = new JTextField();
		letra1CuartoIntento.setColumns(10);
		letra1CuartoIntento.setBounds(24, 249, 40, 35);
		frame.getContentPane().add(letra1CuartoIntento);
		letra1CuartoIntento.setEditable(false);
		letra1CuartoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra2CuartoIntento.grabFocus();
			}
		});
		
		letra2CuartoIntento = new JTextField();
		letra2CuartoIntento.setColumns(10);
		letra2CuartoIntento.setBounds(73, 249, 40, 35);
		frame.getContentPane().add(letra2CuartoIntento);
		letra2CuartoIntento.setEditable(false);
		letra2CuartoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra3CuartoIntento.grabFocus();
			}
		});
		
		letra3CuartoIntento = new JTextField();
		letra3CuartoIntento.setColumns(10);
		letra3CuartoIntento.setBounds(123, 249, 40, 35);
		frame.getContentPane().add(letra3CuartoIntento);
		letra3CuartoIntento.setEditable(false);
		letra3CuartoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra4CuartoIntento.grabFocus();
			}
		});
		
		letra4CuartoIntento = new JTextField();
		letra4CuartoIntento.setColumns(10);
		letra4CuartoIntento.setBounds(172, 249, 40, 35);
		frame.getContentPane().add(letra4CuartoIntento);
		letra4CuartoIntento.setEditable(false);
		letra4CuartoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra5CuartoIntento.grabFocus();
			}
		});
		
		letra5CuartoIntento = new JTextField();
		letra5CuartoIntento.setColumns(10);
		letra5CuartoIntento.setBounds(222, 249, 40, 35);
		frame.getContentPane().add(letra5CuartoIntento);
		letra5CuartoIntento.setEditable(false);
		letra5CuartoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra1QuintoIntento.grabFocus();
			}
		});
		
		letra1QuintoIntento = new JTextField();
		letra1QuintoIntento.setColumns(10);
		letra1QuintoIntento.setBounds(24, 297, 40, 35);
		frame.getContentPane().add(letra1QuintoIntento);
		letra1QuintoIntento.setEditable(false);
		letra1QuintoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra2QuintoIntento.grabFocus();
			}
		});
		
		letra2QuintoIntento = new JTextField();
		letra2QuintoIntento.setColumns(10);
		letra2QuintoIntento.setBounds(73, 297, 40, 35);
		frame.getContentPane().add(letra2QuintoIntento);
		letra2QuintoIntento.setEditable(false);
		letra2QuintoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra3QuintoIntento.grabFocus();
			}
		});
		
		letra3QuintoIntento = new JTextField();
		letra3QuintoIntento.setColumns(10);
		letra3QuintoIntento.setBounds(123, 297, 40, 35);
		frame.getContentPane().add(letra3QuintoIntento);
		letra3QuintoIntento.setEditable(false);
		letra3QuintoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra4QuintoIntento.grabFocus();
			}
		});
		
		letra4QuintoIntento = new JTextField();
		letra4QuintoIntento.setColumns(10);
		letra4QuintoIntento.setBounds(172, 297, 40, 35);
		frame.getContentPane().add(letra4QuintoIntento);
		letra4QuintoIntento.setEditable(false);
		letra4QuintoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra5QuintoIntento.grabFocus();
			}
		});
		
		letra5QuintoIntento = new JTextField();
		letra5QuintoIntento.setColumns(10);
		letra5QuintoIntento.setBounds(222, 297, 40, 35);
		frame.getContentPane().add(letra5QuintoIntento);
		letra5QuintoIntento.setEditable(false);
		letra5QuintoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra1SextoIntento.grabFocus();
			}
		});
		
		letra1SextoIntento = new JTextField();
		letra1SextoIntento.setColumns(10);
		letra1SextoIntento.setBounds(24, 343, 40, 35);
		frame.getContentPane().add(letra1SextoIntento);
		letra1SextoIntento.setEditable(false);
		letra1SextoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra2SextoIntento.grabFocus();
			}
		});
		
		letra2SextoIntento = new JTextField();
		letra2SextoIntento.setColumns(10);
		letra2SextoIntento.setBounds(73, 343, 40, 35);
		frame.getContentPane().add(letra2SextoIntento);
		letra2SextoIntento.setEditable(false);
		letra2SextoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra3SextoIntento.grabFocus();
			}
		});
		
		letra3SextoIntento = new JTextField();
		letra3SextoIntento.setColumns(10);
		letra3SextoIntento.setBounds(123, 343, 40, 35);
		frame.getContentPane().add(letra3SextoIntento);
		letra3SextoIntento.setEditable(false);
		letra3SextoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra4SextoIntento.grabFocus();
			}
		});
		
		letra4SextoIntento = new JTextField();
		letra4SextoIntento.setColumns(10);
		letra4SextoIntento.setBounds(172, 343, 40, 35);
		frame.getContentPane().add(letra4SextoIntento);
		letra4SextoIntento.setEditable(false);
		letra4SextoIntento.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				letra5SextoIntento.grabFocus();
			}
		});
		
		letra5SextoIntento = new JTextField();
		letra5SextoIntento.setColumns(10);
		letra5SextoIntento.setBounds(222, 343, 40, 35);
		frame.getContentPane().add(letra5SextoIntento);
		letra5SextoIntento.setEditable(false);
		
		lblTitulo = new JLabel("WORDLE");
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(new Font("Stencil", Font.BOLD, 37));
		lblTitulo.setBounds(61, 22, 201, 47);
		frame.getContentPane().add(lblTitulo);
	
		JOptionPane.showMessageDialog(null, "INSTRUCCIONES DEL JUEGO\n " + "• Si la letra no está en la palabra secreta, se marca en gris.\r\n"
				+ "• Si la letra está en la palabra secreta pero no está en la misma posición que en la palabra que dio el usuario, se marca en amarillo.\r\n"
				+ " • Si la letra está en la palabra secreta y en la posición correcta, se marca en verde.\r\n"
				+ "");
		
		JButton btnJugar = new JButton("JUGAR");
		btnJugar.setFont(new Font("Tahoma", Font.BOLD, 11));
	
		btnJugar.addActionListener(new ActionListener() {
			int click = 0;
			public void actionPerformed(ActionEvent arg0) {
				click ++;
				if (click == 1) {
					palabra += letra1.getText() + letra2.getText() + letra3.getText() + letra4.getText() + letra5.getText();					
					palabraWordle.verificarPalabra(palabra);
					//Letra1
					if (!palabraWordle.getPalabra().equals(palabra)) {
						palabra = "";
						if (palabraWordle.getColoresLetra()[0] == 'v') {
							letra1.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[0] == 'a') {
							letra1.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[0] == 'g') {
							letra1.setBackground(Color.gray);
						}				
						//Letra2
						if (palabraWordle.getColoresLetra()[1] == 'v') {
							letra2.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[1] == 'a') {
							letra2.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[1] == 'g') {
							letra2.setBackground(Color.gray);
						}
						//Letra3
						if (palabraWordle.getColoresLetra()[2] == 'v') {
							letra3.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[2] == 'a') {
							letra3.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[2] == 'g') {
							letra3.setBackground(Color.gray);
						}
						//Letra4
						if (palabraWordle.getColoresLetra()[3] == 'v') {
							letra4.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[3] == 'a') {
							letra4.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[3] == 'g') {
							letra4.setBackground(Color.gray);
						}
						//Letra5
						if (palabraWordle.getColoresLetra()[4] == 'v') {
							letra5.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[4] == 'a') {
							letra5.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[4] == 'g') {
							letra5.setBackground(Color.gray);
						}
					}				
					if (palabraWordle.getPalabra().equals(palabra)) {
						letra1.setBackground(Color.green);
						letra2.setBackground(Color.green);
						letra3.setBackground(Color.green);
						letra4.setBackground(Color.green);
						letra5.setBackground(Color.green);
						JOptionPane.showMessageDialog(null, "FELICITACIONES, GANASTE");			
						System.exit(-1);
						palabra = "";
					}					
					letra1.setEditable(false);
					letra2.setEditable(false);
					letra3.setEditable(false);
					letra4.setEditable(false);
					letra5.setEditable(false);
					
					letra1SegundoIntento.setEditable(true);
					letra2SegundoIntento.setEditable(true);
					letra3SegundoIntento.setEditable(true);
					letra4SegundoIntento.setEditable(true);
					letra5SegundoIntento.setEditable(true);
				}				
				if (click == 2) {
					palabra += letra1SegundoIntento.getText() + letra2SegundoIntento.getText() + letra3SegundoIntento.getText() + letra4SegundoIntento.getText() + letra5SegundoIntento.getText();
					palabraWordle.verificarPalabra(palabra);					
					//Letra1
					if (!palabraWordle.getPalabra().equals(palabra)) {
						palabra = "";
						if (palabraWordle.getColoresLetra()[0] == 'v') {
							letra1SegundoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[0] == 'a') {
							letra1SegundoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[0] == 'g') {
							letra1SegundoIntento.setBackground(Color.gray);
						}				
						//Letra2
						if (palabraWordle.getColoresLetra()[1] == 'v') {
							letra2SegundoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[1] == 'a') {
							letra2SegundoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[1] == 'g') {
							letra2SegundoIntento.setBackground(Color.gray);
						}
						//Letra3
						if (palabraWordle.getColoresLetra()[2] == 'v') {
							letra3SegundoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[2] == 'a') {
							letra3SegundoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[2] == 'g') {
							letra3SegundoIntento.setBackground(Color.gray);
						}
						//Letra4
						if (palabraWordle.getColoresLetra()[3] == 'v') {
							letra4SegundoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[3] == 'a') {
							letra4SegundoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[3] == 'g') {
							letra4SegundoIntento.setBackground(Color.gray);
						}
						//Letra5
						if (palabraWordle.getColoresLetra()[4] == 'v') {
							letra5SegundoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[4] == 'a') {
							letra5SegundoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[4] == 'g') {
							letra5SegundoIntento.setBackground(Color.gray);
						}
					}					
					if (palabraWordle.getPalabra().equals(palabra)) {
						letra1SegundoIntento.setBackground(Color.green);
						letra2SegundoIntento.setBackground(Color.green);
						letra3SegundoIntento.setBackground(Color.green);
						letra4SegundoIntento.setBackground(Color.green);
						letra5SegundoIntento.setBackground(Color.green);
						JOptionPane.showMessageDialog(null, "FELICITACIONES, GANASTE");
						System.exit(-1);
						palabra = "";
					}
					letra1SegundoIntento.setEditable(false);
					letra2SegundoIntento.setEditable(false);
					letra3SegundoIntento.setEditable(false);
					letra4SegundoIntento.setEditable(false);
					letra5SegundoIntento.setEditable(false);
					
					letra1TercerIntento.setEditable(true);
					letra2TercerIntento.setEditable(true);
					letra3TercerIntento.setEditable(true);
					letra4TercerIntento.setEditable(true);
					letra5TercerIntento.setEditable(true);
				}
				if (click == 3) {
					palabra += letra1TercerIntento.getText() + letra2TercerIntento.getText() + letra3TercerIntento.getText() + letra4TercerIntento.getText() + letra5TercerIntento.getText();				
					palabraWordle.verificarPalabra(palabra);
					//Letra1
					if (!palabraWordle.getPalabra().equals(palabra) ) {									
						palabra = "";
						if (palabraWordle.getColoresLetra()[0] == 'v') {
							letra1TercerIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[0] == 'a') {
							letra1TercerIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[0] == 'g') {
							letra1TercerIntento.setBackground(Color.gray);
						}				
						//Letra2
						if (palabraWordle.getColoresLetra()[1] == 'v') {
							letra2TercerIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[1] == 'a') {
							letra2TercerIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[1] == 'g') {
							letra2TercerIntento.setBackground(Color.gray);
						}
						//Letra3
						if (palabraWordle.getColoresLetra()[2] == 'v') {
							letra3TercerIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[2] == 'a') {
							letra3TercerIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[2] == 'g') {
							letra3TercerIntento.setBackground(Color.gray);
						}
						//Letra4
						if (palabraWordle.getColoresLetra()[3] == 'v') {
							letra4TercerIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[3] == 'a') {
							letra4TercerIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[3] == 'g') {
							letra4TercerIntento.setBackground(Color.gray);
						}
						//Letra5
						if (palabraWordle.getColoresLetra()[4] == 'v') {
							letra5TercerIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[4] == 'a') {
							letra5TercerIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[4] == 'g') {
							letra5TercerIntento.setBackground(Color.gray);
						}
					}
					
					if (palabraWordle.getPalabra().equals(palabra)) {
						letra1TercerIntento.setBackground(Color.green);
						letra2TercerIntento.setBackground(Color.green);
						letra3TercerIntento.setBackground(Color.green);
						letra4TercerIntento.setBackground(Color.green);
						letra5TercerIntento.setBackground(Color.green);
						JOptionPane.showMessageDialog(null, "FELICITACIONES, GANASTE");
						System.exit(-1);
						palabra = "";
					}
					letra1TercerIntento.setEditable(false);
					letra2TercerIntento.setEditable(false);
					letra3TercerIntento.setEditable(false);
					letra4TercerIntento.setEditable(false);
					letra5TercerIntento.setEditable(false);
					
					letra1CuartoIntento.setEditable(true);
					letra2CuartoIntento.setEditable(true);
					letra3CuartoIntento.setEditable(true);
					letra4CuartoIntento.setEditable(true);
					letra5CuartoIntento.setEditable(true);					
				}
				if (click == 4) {
					palabra += letra1CuartoIntento.getText() + letra2CuartoIntento.getText() + letra3CuartoIntento.getText() + letra4CuartoIntento.getText() + letra5CuartoIntento.getText();					
					palabraWordle.verificarPalabra(palabra);
					//Letra1
					if (!palabraWordle.getPalabra().equals(palabra) ) {								
						palabra = "";
						if (palabraWordle.getColoresLetra()[0] == 'v') {
							letra1CuartoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[0] == 'a') {
							letra1CuartoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[0] == 'g') {
							letra1CuartoIntento.setBackground(Color.gray);
						}				
						//Letra2
						if (palabraWordle.getColoresLetra()[1] == 'v') {
							letra2CuartoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[1] == 'a') {
							letra2CuartoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[1] == 'g') {
							letra2CuartoIntento.setBackground(Color.gray);
						}
						//Letra3
						if (palabraWordle.getColoresLetra()[2] == 'v') {
							letra3CuartoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[2] == 'a') {
							letra3CuartoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[2] == 'g') {
							letra3CuartoIntento.setBackground(Color.gray);
						}
						//Letra4
						if (palabraWordle.getColoresLetra()[3] == 'v') {
							letra4CuartoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[3] == 'a') {
							letra4CuartoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[3] == 'g') {
							letra4CuartoIntento.setBackground(Color.gray);
						}
						//Letra5
						if (palabraWordle.getColoresLetra()[4] == 'v') {
							letra5CuartoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[4] == 'a') {
							letra5CuartoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[4] == 'g') {
							letra5CuartoIntento.setBackground(Color.gray);
						}
					}
					
					if (palabraWordle.getPalabra().equals(palabra)) {
						letra1CuartoIntento.setBackground(Color.green);
						letra2CuartoIntento.setBackground(Color.green);
						letra3CuartoIntento.setBackground(Color.green);
						letra4CuartoIntento.setBackground(Color.green);
						letra5CuartoIntento.setBackground(Color.green);
						JOptionPane.showMessageDialog(null, "FELICITACIONES, GANASTE");
						System.exit(-1);
						palabra = "";
					}
					letra1CuartoIntento.setEditable(false);
					letra2CuartoIntento.setEditable(false);
					letra3CuartoIntento.setEditable(false);
					letra4CuartoIntento.setEditable(false);
					letra5CuartoIntento.setEditable(false);
					
					letra1QuintoIntento.setEditable(true);
					letra2QuintoIntento.setEditable(true);
					letra3QuintoIntento.setEditable(true);
					letra4QuintoIntento.setEditable(true);
					letra5QuintoIntento.setEditable(true);
				}				
				if (click == 5) {
					palabra += letra1QuintoIntento.getText() + letra2QuintoIntento.getText() + letra3QuintoIntento.getText() + letra4QuintoIntento.getText() + letra5QuintoIntento.getText();					
					palabraWordle.verificarPalabra(palabra);
					//Letra1
					if (!palabraWordle.getPalabra().equals(palabra) ) {									
						palabra = "";
						if (palabraWordle.getColoresLetra()[0] == 'v') {
							letra1QuintoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[0] == 'a') {
							letra1QuintoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[0] == 'g') {
							letra1QuintoIntento.setBackground(Color.gray);
						}				
						//Letra2
						if (palabraWordle.getColoresLetra()[1] == 'v') {
							letra2QuintoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[1] == 'a') {
							letra2QuintoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[1] == 'g') {
							letra2QuintoIntento.setBackground(Color.gray);
						}
						//Letra3
						if (palabraWordle.getColoresLetra()[2] == 'v') {
							letra3QuintoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[2] == 'a') {
							letra3QuintoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[2] == 'g') {
							letra3QuintoIntento.setBackground(Color.gray);
						}
						//Letra4
						if (palabraWordle.getColoresLetra()[3] == 'v') {
							letra4QuintoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[3] == 'a') {
							letra4QuintoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[3] == 'g') {
							letra4QuintoIntento.setBackground(Color.gray);
						}
						//Letra5
						if (palabraWordle.getColoresLetra()[4] == 'v') {
							letra5QuintoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[4] == 'a') {
							letra5QuintoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[4] == 'g') {
							letra5QuintoIntento.setBackground(Color.gray);
						}
					}				
					if (palabraWordle.getPalabra().equals(palabra)) {
						letra1QuintoIntento.setBackground(Color.green);
						letra2QuintoIntento.setBackground(Color.green);
						letra3QuintoIntento.setBackground(Color.green);
						letra4QuintoIntento.setBackground(Color.green);
						letra5QuintoIntento.setBackground(Color.green);
						JOptionPane.showMessageDialog(null, "FELICITACIONES, GANASTE");
						System.exit(-1);
						palabra = "";
					}					
					letra1QuintoIntento.setEditable(false);
					letra2QuintoIntento.setEditable(false);
					letra3QuintoIntento.setEditable(false);
					letra4QuintoIntento.setEditable(false);
					letra5QuintoIntento.setEditable(false);
					
					letra1SextoIntento.setEditable(true);
					letra2SextoIntento.setEditable(true);
					letra3SextoIntento.setEditable(true);
					letra4SextoIntento.setEditable(true);
					letra5SextoIntento.setEditable(true);
				}
				if (click == 6) {
					palabra += letra1SextoIntento.getText() + letra2SextoIntento.getText() + letra3SextoIntento.getText() + letra4SextoIntento.getText() + letra5SextoIntento.getText();
					palabraWordle.verificarPalabra(palabra);
					//Letra1
					if (!palabraWordle.getPalabra().equals(palabra) ) {									
						if (palabraWordle.getColoresLetra()[0] == 'v') {
							letra1SextoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[0] == 'a') {
							letra1SextoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[0] == 'g') {
							letra1SextoIntento.setBackground(Color.gray);
						}				
						//Letra2
						if (palabraWordle.getColoresLetra()[1] == 'v') {
							letra2SextoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[1] == 'a') {
							letra2SextoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[1] == 'g') {
							letra2SextoIntento.setBackground(Color.gray);
						}
						//Letra3
						if (palabraWordle.getColoresLetra()[2] == 'v') {
							letra3SextoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[2] == 'a') {
							letra3SextoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[2] == 'g') {
							letra3SextoIntento.setBackground(Color.gray);
						}
						//Letra4
						if (palabraWordle.getColoresLetra()[3] == 'v') {
							letra4SextoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[3] == 'a') {
							letra4SextoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[3] == 'g') {
							letra4SextoIntento.setBackground(Color.gray);
						}
						//Letra5
						if (palabraWordle.getColoresLetra()[4] == 'v') {
							letra5SextoIntento.setBackground(Color.green);
						}
						if (palabraWordle.getColoresLetra()[4] == 'a') {
							letra5SextoIntento.setBackground(Color.yellow);
						}
						if (palabraWordle.getColoresLetra()[4] == 'g') {
							letra5SextoIntento.setBackground(Color.gray);
						}
					}				
					if (palabraWordle.getPalabra().equals(palabra)) {
						letra1SextoIntento.setBackground(Color.green);
						letra2SextoIntento.setBackground(Color.green);
						letra3SextoIntento.setBackground(Color.green);
						letra4SextoIntento.setBackground(Color.green);
						letra5SextoIntento.setBackground(Color.green);
						JOptionPane.showMessageDialog(null, "FELICITACIONES, GANASTE");
						System.exit(-1);
						palabra = "";
					} else {
						JOptionPane.showMessageDialog(null, "SE TERMINARON LOS INTENTOS!! La palabra correcta era: " + palabraWordle.getPalabra());
					}
				}
				JButton btnReset = new JButton("VOLVER A JUGAR");
				btnReset.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						click = 0;
					}
				});
				btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnReset.setForeground(Color.BLACK);				
			}
		});
		btnJugar.setBounds(173, 405, 89, 23);
		frame.getContentPane().add(btnJugar);
	}
}
