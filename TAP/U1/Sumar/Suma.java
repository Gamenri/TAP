package Sumar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Suma {
    JFrame frame = new JFrame();                                // Creación del Lienzo
    Suma () {
        frame.setTitle("Suma");                                 // Titulo de la ventana
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);          // Permite extender la ventana (set to maximizar toda la pantalla)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Set to terminar el programa al cerrar la ventana
        frame.setLocationRelativeTo(null);                      // Da control del mouse
        frame.setLayout(null);                                  // Te permite administrar los componentes
    }// Constructor Suma

    JButton botonSumar = new JButton("Sumar");
    JButton botonRaiz = new JButton("Raiz");
    JButton botonLimpiar = new JButton("Limpiar");
    JButton botonSalir = new JButton("Salir");

    JLabel etiquetaNum1 = new JLabel("INGRESAR NUM1:");
    JLabel etiquetaNum2 = new JLabel("INGRESAR NUM2:");

    JLabel ETQresultado1 = new JLabel(" ");
    JLabel ETQresultado2 = new JLabel(" ");

    JTextField textF_n1 = new JTextField();
    JTextField textF_n2 = new JTextField();

    double [] vector1 = new double[10];
    double [] vector2 = new double[10];
    int i = 0, j = 0;

    void metodo () {
        // Paleta de color principal
        Color Cereza = new Color(246, 48, 73);
        Color Carmesi = new Color(208, 39, 82);
        Color Magenta = new Color(138, 36, 75);
        Color NegroAzul = new Color(17, 31, 53);
        Color Fondo1 = new Color(58,58,58);
        Color Fondo2 = new Color(72,72,72);
        frame.getContentPane().setBackground(Cereza); // Color de fondo
        frame.add(new JLabel("TECNOLOGICO DE COLIMA"));

        frame.add(etiquetaNum1);
        frame.add(etiquetaNum2);
        frame.add(ETQresultado1);
        frame.add(ETQresultado2);
        frame.add(botonSumar);
        frame.add(botonRaiz);
        frame.add(botonLimpiar);
        frame.add(botonSalir);
        frame.add(textF_n1);
        frame.add(textF_n2);

        // Posiciones de elementos
        etiquetaNum1.setBounds(70, 150, 370, 80);
        textF_n1.setBounds(440, 150, 300, 80);
        etiquetaNum2.setBounds(70,230,370,80);
        textF_n2.setBounds(440,230,300,80);

        ETQresultado1.setBounds(70,330,370,80);
        ETQresultado2.setBounds(70,380,370,80);

        botonSumar.setBounds(0,500,200,80);
        botonRaiz.setBounds(200,500,200,80);
        botonLimpiar.setBounds(400,500,200,80);
        botonSalir.setBounds(600,500,200,80);

        //-- Formato --
        // Inicia el sector de dar formato a la GUI
        Color CTexto1 = NegroAzul;
        Color CTexto2 = NegroAzul;

        // Color de fuente
        etiquetaNum1.setForeground(CTexto1);
        etiquetaNum2.setForeground(CTexto1);
        ETQresultado1.setForeground(CTexto2);
        ETQresultado2.setForeground(CTexto2);

        // Fuente
        Font FontEtiquetas1 = new Font("Arial", Font.BOLD,30);
        etiquetaNum1.setFont(FontEtiquetas1);
        etiquetaNum2.setFont(FontEtiquetas1);
        ETQresultado1.setFont(FontEtiquetas1);
        ETQresultado2.setFont(FontEtiquetas1);
        textF_n1.setFont(FontEtiquetas1);
        textF_n1.setHorizontalAlignment(JTextField.CENTER);
        textF_n2.setFont(FontEtiquetas1);
        textF_n2.setHorizontalAlignment(JTextField.CENTER);

        Font FontBotones = new Font("Arial",Font.BOLD,15);
        botonSumar.setFont(FontBotones);
        botonRaiz.setFont(FontBotones);
        botonLimpiar.setFont(FontBotones);
        botonSalir.setFont(FontBotones);

        // Colores de fondo
        textF_n1.setBackground(Carmesi);
        textF_n2.setBackground(Carmesi);
        botonSumar.setBackground(Carmesi);
        botonRaiz.setBackground(Carmesi);
        botonLimpiar.setBackground(Carmesi);
        botonSalir.setBackground(Carmesi);

        // Acciones
        // SUMA
        botonSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double suma;
                double n1,n2;
                n1 = Double.parseDouble(textF_n1.getText());
                n2 = Double.parseDouble(textF_n2.getText());
                suma = n1 + n2;
                vector1[i] = suma;
                if (i < vector1.length) i++;
                String cadena = " ";
                for (int k = 0; k < i; k++) {
                    cadena = cadena + vector1[k] + " ";
                }
                ETQresultado1.setText("La suma es " + suma);
                ETQresultado2.setText("Vector" + cadena);
            }
        });
        // RAIZ
        botonRaiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double raiz1, raiz2;
                raiz1 = Math.sqrt(Double.parseDouble(textF_n1.getText()));
                raiz2 = Math.sqrt(Double.parseDouble(textF_n2.getText()));
                ETQresultado1.setText("La raiz de " + textF_n1.getText() + " es " + raiz1);
                ETQresultado2.setText("La raiz de " + textF_n2.getText() + " es " + raiz2);
            }
        });
        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textF_n1.setText("");
                textF_n2.setText("");
                ETQresultado1.setText("");
                ETQresultado2.setText("");
            }
        });
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Hacer el Frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Suma Ventana = new Suma();
        Ventana.metodo();
    }
}
