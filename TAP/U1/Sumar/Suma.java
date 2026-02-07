package Sumar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
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

    // ===CREACION DE ELEMENTOS===
    // ---BOTONES---
    JButton botonSumar = new JButton("Sumar");
    JButton botonRaiz = new JButton("Raiz");
    JButton botonLimpiar = new JButton("Limpiar");
    JButton botonDecimal = new JButton("Decimal");
    JButton botonSalir = new JButton("Salir");

    // ---TEXTO ESTATICO---
    JLabel etiquetaNum1 = new JLabel("NUMERO 1");
    JLabel etiquetaNum2 = new JLabel("NUMERO 2");

    // ---TEXTO MANIPULABLE---
    JLabel ETQresultado1 = new JLabel(" ");
    JLabel ETQresultado2 = new JLabel(" ");
    JLabel ETQresultado3 = new JLabel(" ");
    JLabel ETQresultado4 = new JLabel(" ");

    // ---CAMPOS DE TEXTO---
    JTextField textF_n1 = new JTextField();
    JTextField textF_n2 = new JTextField();

    double []
        sumas = new double[10],
        raices1 = new double[10],
        raices2 = new double[10];
    int
        i = 0,
        j = 0,
        k = 0;

    @SuppressWarnings("all") // Me hartaron nomas lol, se puede quitar
    void metodo () {
        frame.add(etiquetaNum1);
        frame.add(etiquetaNum2);
        frame.add(textF_n1);
        frame.add(textF_n2);

        frame.add(ETQresultado1);
        frame.add(ETQresultado2);
        frame.add(ETQresultado3);
        frame.add(ETQresultado4);

        frame.add(botonSumar);
        frame.add(botonRaiz);
        frame.add(botonLimpiar);
        frame.add(botonDecimal);
        frame.add(botonSalir);

        // ===COORDENADAS DE ELEMENTOS===
        etiquetaNum1.setBounds(70, 150, 300, 80);
        textF_n1.setBounds(70, 230, 300, 80);
        etiquetaNum2.setBounds(370,150,300,80);
        textF_n2.setBounds(370,230,300,80);

        ETQresultado1.setBounds(70,360,600,40);
        ETQresultado2.setBounds(70,400,600,40);
        ETQresultado3.setBounds(70,490,600,40);
        ETQresultado4.setBounds(70,530,600,40);

        botonSalir.setBounds(295,40,150,40);

        botonSumar.setBounds(70,110,150,40);
        botonRaiz.setBounds(220,110,150,40);
        botonLimpiar.setBounds(370,110,150,40);
        botonDecimal.setBounds(520,110,150,40);

        // ===FORMATO===
        // ---FUENTE---
        Font FontEtiquetas1 = new Font("Arial", Font.BOLD,30);
        Font FontEtiquetas2 = new Font("Arial", Font.BOLD,25);
        Font FontBotones = new Font("Arial",Font.BOLD,15);

        etiquetaNum1.setFont(FontEtiquetas1);
        etiquetaNum1.setHorizontalAlignment(JTextField.CENTER);
        etiquetaNum2.setFont(FontEtiquetas1);
        etiquetaNum2.setHorizontalAlignment(JTextField.CENTER);

        ETQresultado1.setFont(FontEtiquetas1);
        ETQresultado2.setFont(FontEtiquetas2);
        ETQresultado3.setFont(FontEtiquetas1);
        ETQresultado4.setFont(FontEtiquetas2);

        textF_n1.setFont(FontEtiquetas1);
        textF_n1.setHorizontalAlignment(JTextField.CENTER);
        textF_n2.setFont(FontEtiquetas1);
        textF_n2.setHorizontalAlignment(JTextField.CENTER);

        botonSumar.setFont(FontBotones);
        botonRaiz.setFont(FontBotones);
        botonLimpiar.setFont(FontBotones);
        botonDecimal.setFont(FontBotones);
        botonSalir.setFont(FontBotones);

        // ---COLORES---
        // >>>PALETA<<<
        Color
                Cereza = new Color(246, 48, 73),
                Carmesi = new Color(208, 39, 82),
                Magenta = new Color(138, 36, 75),
                NegroAzul = new Color(17, 31, 53);

        // >>>FUENTE<<<
        etiquetaNum1.setForeground(NegroAzul);
        etiquetaNum2.setForeground(NegroAzul);

        ETQresultado1.setForeground(NegroAzul);
        ETQresultado2.setForeground(NegroAzul);
        ETQresultado3.setForeground(NegroAzul);
        ETQresultado4.setForeground(NegroAzul);

        // >>>FONDO<<<
        frame.getContentPane().setBackground(Cereza);

        textF_n1.setBackground(Carmesi);
        textF_n2.setBackground(Carmesi);

        botonSumar.setBackground(Carmesi);
        botonRaiz.setBackground(Carmesi);
        botonLimpiar.setBackground(Carmesi);
        botonDecimal.setBackground(Carmesi);
        botonSalir.setBackground(Carmesi);

        // ===ACCIONES===
        // ---SUMA---
        botonSumar.addActionListener(e -> {
            double suma;
            double n1,n2;
            if (!Objects.equals(textF_n1.getText(), " ") && !Objects.equals(textF_n2.getText(), " ")) {
                n1 = Double.parseDouble(textF_n1.getText());
                n2 = Double.parseDouble(textF_n2.getText());
                suma = n1 + n2;
                sumas[i] = suma;
                if (i < sumas.length) i++;
                String cadena = " ";
                for (int k = 0; k < i; k++) {
                    cadena = cadena + sumas[k] + " ";
                }
                ETQresultado1.setText("La suma de " + textF_n1.getText() + " mas " + textF_n2.getText() + " es " + suma);
                ETQresultado2.setText("Vector " + cadena);
                ETQresultado3.setText("");
                ETQresultado4.setText("");
            }
            textF_n1.setText(" ");
            textF_n2.setText(" ");
        });

        // ---RAIZ---
        botonRaiz.addActionListener(e -> {
            double raiz1, raiz2;

            if (!Objects.equals(textF_n1.getText(), " ")) {
                raiz1 = Math.sqrt(Double.parseDouble(textF_n1.getText()));
                raices1[j] = raiz1;

                if (j < raices1.length) j++;

                String cadena1 = " ";

                for (int l = 0; l < j; l++) cadena1 = (cadena1 + raices1[l] + " ");

                ETQresultado1.setText("La raiz de " + textF_n1.getText() + " es " + raiz1);
                ETQresultado2.setText("Vector " + cadena1);
            }
            textF_n1.setText(" ");

            if (!Objects.equals(textF_n2.getText(), " ")) {
                raiz2 = Math.sqrt(Double.parseDouble(textF_n2.getText()));
                raices2[k] = raiz2;

                if (k < raices2.length) k++;

                String cadena2 = " ";

                for (int l = 0; l < k; l++) cadena2 = (cadena2 + raices2[l] + " ");

                ETQresultado3.setText("La raiz de " + textF_n2.getText() + " es " + raiz2);
                ETQresultado4.setText("Vector " + cadena2);
            }
            textF_n2.setText(" ");
        });

        // ---LIMPIAR---
        botonLimpiar.addActionListener(e -> {
            ETQresultado1.setText("");
            ETQresultado2.setText("");
            ETQresultado3.setText("");
            ETQresultado4.setText("");
            sumas = new double[10];
            raices1 = new double[10];
            raices2 = new double[10];
        });

        // ---SALIR---
        botonSalir.addActionListener(e -> System.exit(0));

        // Hacer el Frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Suma Ventana = new Suma();
        Ventana.metodo();
    }
}
