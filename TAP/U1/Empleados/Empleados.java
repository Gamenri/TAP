package Empleados;

import javax.swing.*;
import java.awt.*;

class FrameInicio extends JFrame{
    JFrame frameInicio = new JFrame();
    String usuario = "";
    JButton botonEntrar = new JButton();
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
}// Clase Frame

public class Empleados {
    public static void main(String[] args) {

    }// main
}// Clase Empleados
