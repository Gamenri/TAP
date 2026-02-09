package Calculadora;

import javax.swing.*;

public class Calculadora {
    JFrame App = new JFrame();

    Calculadora() {
        App.setTitle("Calculadora");
        App.setExtendedState(JFrame.MAXIMIZED_BOTH);
        App.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App.setLocationRelativeTo(null);
        App.setLayout(null);
    }

    // ===ELEMENTOS===
    // 11 botones
    JButton botonSuma = new JButton("Suma");
    JButton botonResta = new JButton("Resta");
    JButton botonMultiplicacion = new JButton("Multiplicacion");
    JButton botonDividision = new JButton("Division");
    JButton botonRaiz = new JButton("Raiz");
    JButton botonMayor = new JButton("Mayor de 2 numeros");
    JButton botonMenor = new JButton("Menor de 2 numeros");
    JButton botonPotencia = new JButton("Potencia a de b");
    JButton botonFactorial = new JButton("Factorial");
    JButton botonVolumen = new JButton("Volumen");
    JButton botonCalcular = new JButton("Calcular");

    // 5 etiquetas
    JLabel TextoSuperior = new JLabel("SELECCIONE OPERACION");
    JLabel Texto1 = new JLabel(" ");
    JLabel Texto2 = new JLabel(" ");
    JLabel Texto3 = new JLabel(" ");
    JLabel Resultado = new JLabel(" ");

    // 3 campos de texto
    JTextField Campo1 = new JTextField();
    JTextField Campo2 = new JTextField();
    JTextField Campo3 = new JTextField();

    void Armar() {
        // Agregar elementos
        App.add(botonSuma);
        App.add(botonResta);
        App.add(botonMultiplicacion);
        App.add(botonDividision);
        App.add(botonRaiz);
        App.add(botonMayor);
        App.add(botonMenor);
        App.add(botonPotencia);
        App.add(botonFactorial);
        App.add(botonVolumen);
        App.add(botonCalcular);

        App.add(TextoSuperior);
        App.add(Texto1);
        App.add(Texto2);
        App.add(Texto3);
        App.add(Resultado);

        App.add(Campo1);
        App.add(Campo2);
        App.add(Campo3);

        // Colocar elementos
        // Botones
        int limXBotones1 = 80, limYBotones1 = 120;
        int anchoBotones1 = 155, altoBotones1 = 40;

        // Posicionamiento dinamico
        botonSuma.setBounds(limXBotones1,limYBotones1, anchoBotones1,altoBotones1);
        botonResta.setBounds((botonSuma.getX() + anchoBotones1),limYBotones1,anchoBotones1,altoBotones1);
        botonMultiplicacion.setBounds((botonResta.getX() + anchoBotones1),limYBotones1,anchoBotones1,altoBotones1);
        botonDividision.setBounds((botonMultiplicacion.getX() + anchoBotones1),limYBotones1,anchoBotones1,altoBotones1);
        botonRaiz.setBounds((botonDividision.getX() + anchoBotones1),limYBotones1,anchoBotones1,altoBotones1);

        int segundaLinea = (botonSuma.getY() + altoBotones1);
        botonMayor.setBounds(limXBotones1,segundaLinea,anchoBotones1,altoBotones1);
        botonMenor.setBounds((botonMayor.getX() + anchoBotones1), segundaLinea, anchoBotones1, altoBotones1);
        botonPotencia.setBounds((botonMenor.getX() + anchoBotones1), segundaLinea, anchoBotones1, altoBotones1);
        botonFactorial.setBounds((botonPotencia.getX() + anchoBotones1), segundaLinea, anchoBotones1, altoBotones1);
        botonVolumen.setBounds((botonFactorial.getX() + anchoBotones1), segundaLinea, anchoBotones1, altoBotones1);

        botonCalcular.setBounds( ( ((anchoBotones1*5) /2) - (botonCalcular.getWidth()/2)),400,160,40);

        App.setVisible(true);
    }
}
