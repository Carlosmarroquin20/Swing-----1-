import javax.swing.*; //Importando swing
import java.awt.*;
import java.awt.event.*;

public class TareaE extends JFrame implements ActionListener{
    JTextField caja_de_registro;
    JButton Boton;
    JLabel Texto1;
    JLabel Texto2;
    JTextArea Bloque_de_Texto;
    JScrollPane scroll;


    TareaE (){
        JFrame frame = new JFrame();

        Texto2 = new JLabel("-- BIENVENIDOS --");
        Texto2.setBounds(180, -30, 200, 100);
        Texto2.setForeground(Color.red);
        Texto2.setFont(new Font("Serif", Font.PLAIN, 20));


        Texto1 = new JLabel("Ingrese Nombre: ");       //Solo Palabra para pedir nombre.
        Texto1.setFont(new Font("Serif", Font.PLAIN, 16));
        Texto1.setBounds(30, 30, 200, 100); //Posición

        caja_de_registro = new JTextField();                              //Caja para ingresar nombre
        caja_de_registro.setBounds(150,72,200,20);      //Posición - Tamaño
        caja_de_registro.setFont(new Font("Serif", Font.PLAIN, 15));


        //Donde aparece el texto ingresado
        Bloque_de_Texto = new JTextArea();


        //creacion de boton para registrar Nombres
        Boton = new JButton("Registrar!");
        Boton.setFont(new Font("Serif", Font.PLAIN, 15));
        Boton.setBounds(360,72,120,20);
        Boton.addActionListener(this);


        //scroll
        scroll = new JScrollPane(Bloque_de_Texto);
        scroll.setBounds(10, 120, 290, 200);

        
        add(caja_de_registro);
        add(Boton);
        add(Texto2);
        add(Texto1);
        add(scroll);

        //Ventana
        setTitle("Estudiantes - UMG");
        setSize(500,380);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para que el programa se cierre de forma correcta al cerrar la ventana

    }
    public void actionPerformed(ActionEvent e) {
        String Listaa = caja_de_registro.getText();
        Bloque_de_Texto.append(Listaa+"\n");
        caja_de_registro.setText("");
    }
    public static void main(String[] args) {
        new TareaE();
    }
}   