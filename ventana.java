import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;



public class ventana extends JFrame{
	public ventana(){
		setSize(300,300); //Establecemos el tamaño de la ventana*/
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		/*setLocation(512,384);//Establecemos la posicion por defecto de la ventana*/
		//setBounds(384,512,300,300); //Establecemos la ventana con todos los valores
		setLocationRelativeTo(null); //Establecemos la ventana en el centro
		setTitle("Tutorial Programacion ATS");//Establecemos el titulo de la ventana

		iniciarComponentes();
	}

	private void iniciarComponentes(){
		JPanel panel = new JPanel(); //Creacion de un panel
		
		panel.setLayout(null);//Desactivando el diseño por defecto
		this.getContentPane().add(panel); //agregamos el panel a la ventana
		//panel.setBackground(Color.green); //Añadimos color al panel
		JLabel etiqueta = new JLabel();//Creamos una etiqueta de texto
		//etiqueta.setText("Hello Friend");//Establecemos el texto a la etiqueta
		etiqueta.setBounds(100,100,150,50);//Ubicacion y tamaño del label
		etiqueta.setForeground(Color.green);//Color de la letra
		etiqueta.setBackground(Color.black);//Cambiamos el color de fondo de la etiqueta
		panel.add(etiqueta);//Agregamos la etiqueta al panel
		JTextField input = new JTextField("texto por defecto",20);
		JButton boton = new JButton("Obtener Texto");
		panel.add(input);
		panel.add(boton);
		panel.add(etiqueta);
		boton.addActionListener(new ActionListener() {
			  @Override
			  public void actionPerformed(ActionEvent e){
			  	// Recuperamos el contenido del Campo de Texto y lo volcamos sobre la etiqueta
    			etiqueta.setText(input.getText()); 
			  }
		});
	}
}

