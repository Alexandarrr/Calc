package digitron;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame frame;
	private JTextField txtEkran;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 434, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtEkran = new JTextField();
		txtEkran.setText("0");
		txtEkran.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent arg0) 
			{
					InternaLogika.procesirajUnos(arg0.getKeyChar());
					osveziPrikaz();
					arg0.consume();
			}
		});
		txtEkran.setBackground(Color.BLACK);
		txtEkran.setForeground(Color.GREEN);
		txtEkran.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEkran.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtEkran.setBounds(10, 11, 386, 50);
		frame.getContentPane().add(txtEkran);
		txtEkran.setColumns(10);
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				InternaLogika.procesirajUnos('0');
				osveziPrikaz();
			}
		});
		button.setBounds(10, 289, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InternaLogika.procesirajUnos('1');
				osveziPrikaz();
			}
		});
		button_1.setBounds(10, 255, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InternaLogika.procesirajUnos('2');
				osveziPrikaz();
			}
		});
		button_2.setBounds(109, 255, 89, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InternaLogika.procesirajUnos('3');
				osveziPrikaz();
			}
		});
		button_3.setBounds(208, 255, 89, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InternaLogika.procesirajUnos('4');
				osveziPrikaz();
			}
		});
		button_4.setBounds(10, 221, 89, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				InternaLogika.procesirajUnos('5');
				osveziPrikaz();
			}
		});
		button_5.setBounds(109, 221, 89, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InternaLogika.procesirajUnos('6');
				osveziPrikaz();
			}
		});
		button_6.setBounds(208, 221, 89, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InternaLogika.procesirajUnos('7');
				osveziPrikaz();
			}
		});
		button_7.setBounds(10, 187, 89, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InternaLogika.procesirajUnos('8');
				osveziPrikaz();
			}
		});
		button_8.setBounds(109, 187, 89, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					InternaLogika.procesirajUnos('9');
					osveziPrikaz();
			}
		});
		button_9.setBounds(208, 187, 89, 23);
		frame.getContentPane().add(button_9);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(10, 72, 89, 23);
		frame.getContentPane().add(btnC);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				InternaLogika.ocisti(false);
				osveziPrikaz();
			}
		});
		btnCe.setBounds(109, 72, 89, 23);
		frame.getContentPane().add(btnCe);
		
		JButton btnMc = new JButton("MC");
		btnMc.setBounds(208, 72, 89, 23);
		frame.getContentPane().add(btnMc);
		
		JButton btnM = new JButton("M+");
		btnM.setBounds(10, 106, 89, 23);
		frame.getContentPane().add(btnM);
		
		JButton btnM_1 = new JButton("M-");
		btnM_1.setBounds(109, 106, 89, 23);
		frame.getContentPane().add(btnM_1);
		
		JButton btnMr = new JButton("MR");
		btnMr.setBounds(208, 106, 89, 23);
		frame.getContentPane().add(btnMr);
		
		JButton button_10 = new JButton(".");
		button_10.setBounds(109, 289, 89, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("%");
		button_11.setBounds(208, 289, 89, 23);
		frame.getContentPane().add(button_11);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.setBounds(307, 289, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button_12 = new JButton("+");
		button_12.setBounds(307, 255, 89, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("-");
		button_13.setBounds(307, 221, 89, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("*");
		button_14.setBounds(307, 187, 89, 23);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("/");
		button_15.setBounds(307, 153, 89, 23);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("(");
		button_16.setBounds(208, 153, 42, 23);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton(")");
		button_17.setBounds(260, 153, 42, 23);
		frame.getContentPane().add(button_17);
	}
	
	public void osveziPrikaz()
	{
		txtEkran.setText(String.valueOf(InternaLogika.unos));
	}
}
