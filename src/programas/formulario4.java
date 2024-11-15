package programas;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class formulario4 extends JFrame implements ActionListener{

	private JTextField textfield1;
	private JLabel labell;
	private JButton boton1;
	
	
	public static void main(String[] args) {
		formulario4 formulario=new formulario4();
		formulario.setBounds(0,0,350,170);
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public formulario4() {
		setLayout(null);
		labell=new JLabel("USUARIO:");
		labell.setBounds(10, 10, 100, 30);
		add(labell);
		textfield1=new JTextField();
		textfield1.setBounds(120,10,150,20);
		add(textfield1);
		boton1=new JButton("ACEPTAR");
		boton1.setBounds(10, 80, 150, 30);
		add(boton1);
		boton1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			String cadena=textfield1.getText();
			setTitle(cadena);
		}
	}

}
