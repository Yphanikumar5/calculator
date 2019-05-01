package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double firstnum;
	double secnum;
	String op;
	double ans;
	String res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(100, 100, 332, 328);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 300, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton b1 = new JButton("1");
		b1.setForeground(Color.GRAY);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + b1.getText();
				textField.setText(EnterNumber);
			}
		});
		b1.setBounds(10, 205, 53, 35);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.setForeground(Color.GRAY);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + b2.getText();
				textField.setText(EnterNumber);
			}
		});
		b2.setBounds(71, 205, 53, 35);
		frame.getContentPane().add(b2);
		
		JButton b6 = new JButton("6");
		b6.setForeground(Color.GRAY);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + b6.getText();
				textField.setText(EnterNumber);
			}
		});
		b6.setBounds(134, 164, 53, 35);
		frame.getContentPane().add(b6);
		
		JButton b4 = new JButton("4");
		b4.setForeground(Color.GRAY);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + b4.getText();
				textField.setText(EnterNumber);
			}
		});
		b4.setBounds(10, 164, 53, 35);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.setForeground(Color.GRAY);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + b5.getText();
				textField.setText(EnterNumber);
			}
		});
		b5.setBounds(71, 164, 53, 35);
		frame.getContentPane().add(b5);
		
		JButton bdot = new JButton(".");
		bdot.setForeground(Color.GRAY);
		bdot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + bdot.getText();
				
				textField.setText(0+EnterNumber);
				
			}
		});
		bdot.setBounds(134, 246, 53, 35);
		frame.getContentPane().add(bdot);
		
		JButton b7 = new JButton("7");
		b7.setForeground(Color.GRAY);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + b7.getText();
				textField.setText(EnterNumber);
			}
		});
		b7.setBounds(10, 123, 53, 35);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.setForeground(Color.GRAY);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + b8.getText();
				textField.setText(EnterNumber);
			}
		});
		b8.setBounds(71, 123, 53, 35);
		frame.getContentPane().add(b8);
		
		JButton b3 = new JButton("3");
		b3.setForeground(Color.GRAY);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + b3.getText();
				textField.setText(EnterNumber);
			}
		});
		b3.setBounds(134, 205, 53, 35);
		frame.getContentPane().add(b3);
		
		JButton b9 = new JButton("9");
		b9.setForeground(Color.GRAY);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + b9.getText();
				textField.setText(EnterNumber);
			}
		});
		b9.setBounds(134, 123, 53, 35);
		frame.getContentPane().add(b9);
		
		JButton b0 = new JButton("0");
		b0.setForeground(Color.GRAY);
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + b0.getText();
				textField.setText(EnterNumber);
			}
		});
		b0.setBounds(10, 246, 114, 35);
		frame.getContentPane().add(b0);
		
		JButton bequal = new JButton("=");
		bequal.setForeground(Color.GRAY);
		bequal.setBackground(Color.ORANGE);
		bequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secnum=Double.parseDouble(textField.getText());
				if (op.equals("+"))
				{
					ans= firstnum + secnum;
					res=String.format("%.2f", ans);
					textField.setText(res);
				}
				
				if (op.equals("-"))
				{
					ans= firstnum - secnum;
					res=String.format("%.2f", ans);
					textField.setText(res);
				}
				
				if (op.equals("*"))
				{
					ans= firstnum * secnum;
					res=String.format("%.2f", ans);
					textField.setText(res);
				}
				
				if (op.equals("/"))
				{
					ans= firstnum / secnum;
					res=String.format("%.2f", ans);
					textField.setText(res);
				}
				
			}
		});
		bequal.setBounds(256, 205, 53, 76);
		frame.getContentPane().add(bequal);
		
		JButton button_12 = new JButton("\u2190");
		button_12.setBackground(Color.ORANGE);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() > 0 ) {
					StringBuilder del = new StringBuilder (textField.getText());
					del.deleteCharAt(textField.getText().length() -1);
					String back= del.toString();
					textField.setText(back);
					
				}
					
			}
		});
		button_12.setBounds(10, 77, 53, 35);
		frame.getContentPane().add(button_12);
		
		JButton bmul = new JButton("*");
		bmul.setBackground(Color.GRAY);
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				op= "*";
			}
		});
		bmul.setBounds(193, 164, 53, 35);
		frame.getContentPane().add(bmul);
		
		JButton bdiv = new JButton("/");
		bdiv.setBackground(Color.GRAY);
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				op= "/";
			}
		});
		bdiv.setBounds(193, 123, 53, 35);
		frame.getContentPane().add(bdiv);
		
		JButton button_15 = new JButton("\u00B1");
		button_15.setBackground(Color.ORANGE);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = (Double.parseDouble(textField.getText()));
				firstnum *= -1;
				res=String.format("%.2f", firstnum);
				textField.setText(res);
			}
		});
		button_15.setBounds(193, 77, 53, 35);
		frame.getContentPane().add(button_15);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.ORANGE);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(130, 77, 53, 35);
		frame.getContentPane().add(btnC);
		
		JButton btnCe = new JButton("CE");
		btnCe.setBackground(Color.ORANGE);
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText("0");
			}

		});
		btnCe.setBounds(71, 77, 53, 35);
		frame.getContentPane().add(btnCe);
		
		JButton bminus = new JButton("-");
		bminus.setBackground(Color.GRAY);
		bminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				op= "-";
			}
		});
		bminus.setBounds(193, 205, 53, 35);
		frame.getContentPane().add(bminus);
		
		JButton bplus = new JButton("+");
		bplus.setBackground(Color.GRAY);
		bplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum= Double.parseDouble(textField.getText());
				
				textField.setText("");
				op= "+";
			}
		});
		bplus.setBounds(193, 246, 53, 35);
		frame.getContentPane().add(bplus);
		
		JButton btnx = new JButton("1/x");
		btnx.setBackground(Color.ORANGE);
		btnx.setBounds(256, 164, 53, 35);
		frame.getContentPane().add(btnx);
		
		JButton bper = new JButton("%");
		bper.setBackground(Color.ORANGE);
		bper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				secnum=Double.parseDouble(textField.getText());
				
				if (op.equals("+"))
				{
					ans= (firstnum * secnum /100) ;
					res=String.format("%.2f", ans);
					textField.setText(res);
				}
				
				if (op.equals("-"))
				{
					ans= (firstnum * secnum /100) ;
					res=String.format("%.2f", ans);
					textField.setText(res);
				}
				
				if (op.equals("*"))
				{
					ans= (firstnum * secnum /100) ;
					res=String.format("%.2f", ans);
					textField.setText(res);
				}
				
				if (op.equals("/"))
				{
					ans= (firstnum * secnum /100) ;
					res=String.format("%.2f", ans);
					textField.setText(res);
				}
			}
		});
		bper.setBounds(256, 123, 53, 35);
		frame.getContentPane().add(bper);
		
		JButton bsquare = new JButton("\u221A");
		bsquare.setBackground(Color.ORANGE);
		bsquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum= Double.parseDouble(textField.getText());
				ans=(Math.sqrt(firstnum));
				res=String.format("%.7f", ans);
				textField.setText(res);
				
				
			}
		});
		bsquare.setBounds(256, 77, 53, 35);
		frame.getContentPane().add(bsquare);
	}
}
