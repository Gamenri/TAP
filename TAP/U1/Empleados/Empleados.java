package Empleados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        int Intentos = 0;
        botonEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuario=txtClave.getText();
                if (usuario.contentEquals("123")) {
                    JOptionPane.showMessageDialog(null,"CLAVE CORRECTA");
                    Empleados objeto = new Empleados();
                }
            }
        });
    }// Metodo metodoFrameInicio
}// Clase FrameInicio

public class Empleados {
    public static void main(String[] args) {
        FrameInicio login = new FrameInicio();
        login.metodoFrameInicio();
    }// main
}// Clase Empleados
