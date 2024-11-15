package programas;

import javax.swing.*;

@SuppressWarnings("serial")
public class formulario extends JFrame{
	
	private JLabel labell,label2;
	public formulario() {
		setLayout(null);
		labell=new JLabel("hola estudiantes bienvenido a JAVA");
		labell.setBounds(10, 20, 300, 300);
		add(labell);
		label2=new JLabel("Gracias");
		label2.setBounds(10,100,100,30);
		add(label2);
	}
	public static void main(String[] args) {
		formulario formulario1=new formulario();
		formulario1.setBounds(10,10,400,300);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
