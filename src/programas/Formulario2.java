package programas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Formulario2 extends JFrame implements ActionListener{

	JButton boton1;
	
	public Formulario2() {
		setLayout(null);
		boton1=new JButton("finalizar");
		boton1.setBounds(300, 250, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	
	
	public static void main(String[] args) {
		Formulario2 formulario1=new Formulario2();
		formulario1.setBounds(0, 0, 450, 350);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			System.exit(0);
		}
		
	}

}
