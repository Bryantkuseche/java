package flowlayout;
import java.awt.*;

public class gui_java extends Frame{

	private Button b1,b2,b3;

	public Ventana1(){
		super("Esta es la ventana 1");

		setLayout(new FlowLayout());

		b1=new Button("Botong 1");
		add(b1);

		b2=new Button("Botong 2");
		add(b2);

		b3=new Button("Botong 3");
		add(b3);

		setSize(300,300);
		setVisible(true);


	}

	public static void main(String args[]){
		Ventana1  v1 = new Ventana1();  


	}
}