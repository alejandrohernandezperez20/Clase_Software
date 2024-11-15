package programas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Formulario3 extends JFrame implements ActionListener{

	
	private JButton boton1,boton2,boton3;
	
	public Formulario3() {
		setLayout(null);
		boton1=new JButton("1");
		boton1.setBounds(10,100,90,30);
		add(boton1);
		boton1.addActionListener(this);
		boton2=new JButton("2");
		boton2.setBounds(110,100,90,30);
		add(boton2);
		boton2.addActionListener(this);
		boton3=new JButton("3");
		boton3.setBounds(210,100,90,30);
		add(boton3);
		boton3.addActionListener(this);
	}
	
	public static void main(String[] args) {
		Formulario3 formulario=new Formulario3();
		formulario.setBounds(0,0,350,200);
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			setTitle("aparece boton 1");
		}
		if(e.getSource()==boton2) {
			setTitle("cambia boton 2");
		}
		if(e.getSource()==boton3) {
			setTitle("cambia boton 3");
		}
	}

}
