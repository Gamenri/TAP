package Empleados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class FrameInicio extends JFrame{
    JFrame frameInicio = new JFrame();
    String usuario = "";
    JButton botonEntrar = new JButton("INGRESAR");
    JLabel ETQclave = new JLabel("CAPTURAR CLAVE DE ACCESO");
    JTextField txtClave = new JTextField("");
    JLabel Titulo = new JLabel("SISTEMA");

    public FrameInicio() {
        frameInicio.setTitle("FRAME 1");
        frameInicio.setBackground(Color.DARK_GRAY);
        frameInicio.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frameInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameInicio.setLocationRelativeTo(null);
        frameInicio.setLayout(null);
    }// consturctor

    void metodoFrameInicio () {
        frameInicio.add(Titulo);
        frameInicio.add(ETQclave);
        frameInicio.add(txtClave);
        frameInicio.add(botonEntrar);

        Titulo.setBounds(70,70,1500,80);
        Titulo.setFont(new Font("Arial",Font.BOLD,40));
        ETQclave.setBounds(200,160,1300,30);
        ETQclave.setFont(new Font("Arial",Font.PLAIN,40));
        ETQclave.setForeground(Color.BLUE);
        txtClave.setBounds(200,250,300,80);
        txtClave.setFont(new Font("Arial",Font.PLAIN,50));
        txtClave.setForeground(Color.GREEN);
        botonEntrar.setBounds(300,450,300,80);
        botonEntrar.setFont(new Font("Arial",Font.PLAIN,30));
        botonEntrar.setForeground(Color.red);

        frameInicio.setVisible(true);

        botonEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuario=txtClave.getText();
                if (usuario.contentEquals("123")) {
                    JOptionPane.showMessageDialog(null,"CLAVE CORRECTA");
                    Empleados objeto = new Empleados();
                    objeto.Metodo();
                } else {
                    JOptionPane.showMessageDialog(null,"CLAVE INCORRECTA");
                    System.exit(0);
                    dispose();
                }
            }
        });
    }// Metodo metodoFrameInicio
}// Clase FrameInicio

public class Empleados extends FrameInicio{
    JFrame frame = new JFrame();
    String nombre;
    String ApellidosPat;
    String ApellidoMat;
    String numTarjeta;
    String rfc;
    String FechaNac;
    String puesto;
    String sueldo;
    String imagen = "";
    static int i = 0;
    static ArrayList <Empleados> lista = new ArrayList<>();

    JButton botonRFC = new JButton();
    JButton botonSalir = new JButton();
    JButton botonDer = new JButton();
    JButton botonIzq = new JButton();
    JButton botonRegsitrar = new JButton("Guarar");
    JButton botonNuevo = new JButton("Limpiar");
    JButton botonModificar = new JButton("MODIFICAR");
    JButton botonIngresarFoto = new JButton("INGRESAR FOTO");
    JButton botonElimitar = new JButton("ELIMINAR");

    JLabel foto = new JLabel(new ImageIcon("Foto"));

    JLabel etiquetaNum = new JLabel("Num. Tarjeta");
    JLabel etiquetaN1 = new JLabel("RFC");
    JLabel etiquetaN2 = new JLabel("NOMBRE");
    JLabel fechaNacimiento = new JLabel("Fecha Nacimiento DD//MM//AAAA");
    JLabel eituqetaN3 = new JLabel("Apellido1");
    JLabel etiquetaN4 = new JLabel("Apellido2");
    JLabel JLABELpuesto = new JLabel("Puesto");
    JLabel ETQsueldo = new JLabel("Sueldo:");

    JTextField etiquetaRFC = new JTextField();
    JTextField txtNombre = new JTextField();
    JTextField txtApellidoMat = new JTextField();
    JTextField txtApellidoPat = new JTextField();
    JTextField txtNumTar = new JTextField();
    JTextField fecha = new JTextField();


    void Metodo() {
    }

    public static void main(String[] args) {
        FrameInicio login = new FrameInicio();
        login.metodoFrameInicio();
    }// main
}// Clase Empleados
