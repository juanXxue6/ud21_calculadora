package com.calculadoras.ejercicio.UD21_JUNIT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculadora extends JFrame  {

	private JPanel contentPane;
	private String operdaor1 = "";
	private String operdaor2 = "";
	private Operaciones operar = new Operaciones();
	
	boolean canOperate = false;
	boolean reset = false;
	private JLabel operadorAntiguo = new JLabel("", SwingConstants.RIGHT);
	private final JLabel simbolo = new JLabel("", SwingConstants.RIGHT);
	
	JButton btnResult = new JButton("=");
	JButton btn4 = new JButton("4");
	JButton bnt1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn0 = new JButton("0");
	JButton btn7 = new JButton("7");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn8 = new JButton("8");
	JButton btnPlus = new JButton("+");
	JButton btnMult = new JButton("*");
	JButton btnMinus = new JButton("-");
	JButton btnC = new JButton("c");
	JButton btn9 = new JButton("9");
	JButton btnDiv = new JButton("/");
	private JTextField operadorActual;



	public void addText(String num) {
		if(!reset) {
		String add = operadorActual.getText() + num;
			operadorActual.setText(add);
		}else {	
			operadorActual.setText(num);	
			reset = false;
		}
	}

	public void operate(String simboloOp) {
		
		if(!canOperate) {
			
			try {
				int validate = Integer.parseInt(operadorActual.getText());
				operadorAntiguo.setText(Integer.toString(validate));
				operadorActual.setText("");
				simbolo.setText(simboloOp);
				canOperate = true;

			} catch (NumberFormatException e) {
				
					System.err.println(e);	
					operadorActual.setText("");
					canOperate = false;
					simbolo.setText("");
			}

		}else {
			try {
			operadorActual.setText(Integer.toString(operar.calculo(Integer.parseInt(operadorAntiguo.getText()),Integer.parseInt(operadorActual.getText()))));
			operadorAntiguo.setText("");
			simbolo.setText("");
			canOperate = false;
			reset = true;
			}catch (NumberFormatException e) {
				System.err.println(e);	
				operadorActual.setText("");
				operadorAntiguo.setText("");
				canOperate = false;
				simbolo.setText("");
			}
		}
		
	}

	public Calculadora() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		operadorAntiguo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		operadorAntiguo.setBackground(new Color(255, 255, 255));
		operadorAntiguo.setBounds(33, 45, 201, 63);
		contentPane.add(operadorAntiguo);
		
		simbolo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		simbolo.setBackground(Color.WHITE);
		simbolo.setBounds(259, 45, 60, 63);
		contentPane.add(simbolo);
		
		
		operadorActual = new JTextField();
		operadorActual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		operadorActual.setBounds(33, 118, 286, 63);
		contentPane.add(operadorActual);
		operadorActual.setColumns(10);
		
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addText("4");
			}
		});
		
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(34, 286, 60, 60);
		contentPane.add(btn4);
		

		bnt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addText("1");
			}
		});
		bnt1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bnt1.setBounds(34, 357, 60, 60);
		contentPane.add(bnt1);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addText("2");
			}
		});
		

		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(104, 357, 60, 60);
		contentPane.add(btn2);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addText("3");
			}
		});
		

		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(174, 357, 60, 60);
		contentPane.add(btn3);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addText("0");
			}
		});
		

		btn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0.setBounds(104, 428, 60, 60);
		contentPane.add(btn0);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addText("7");
			}
		});
		

		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(34, 215, 60, 60);
		contentPane.add(btn7);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addText("5");
			}
		});
		

		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(104, 286, 60, 60);
		contentPane.add(btn5);
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addText("6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(174, 286, 60, 60);
		contentPane.add(btn6);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addText("8");
			}
		});
		
		

		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(104, 215, 60, 60);
		contentPane.add(btn8);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addText("9");
			}
		});
		
		

		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(174, 215, 60, 60);
		contentPane.add(btn9);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operadorActual.setText("");
				operadorAntiguo.setText("");
				canOperate = false;
			}
		});
		

		btnC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnC.setBounds(34, 428, 60, 60);
		contentPane.add(btnC);
		
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operate("=");
			}
		});
		


		btnResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnResult.setBounds(174, 428, 60, 60);
		contentPane.add(btnResult);
		
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				operate("/");
				operar.setId(4);
			}
		});
		

		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDiv.setBounds(259, 215, 60, 60);
		contentPane.add(btnDiv);
		
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				operate("*");
				operar.setId(3);
			}
		});
		

		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMult.setBounds(259, 286, 60, 60);
		contentPane.add(btnMult);
		
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				operate("-");
				operar.setId(2);
			}
		});
		

		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMinus.setBounds(259, 357, 60, 60);
		contentPane.add(btnMinus);
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				operate("+");

				operar.setId(1);
			}
		});		

		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPlus.setBounds(259, 428, 60, 60);
		contentPane.add(btnPlus);



	}
}
