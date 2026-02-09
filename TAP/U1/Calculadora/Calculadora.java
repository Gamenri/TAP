package Calculadora;

import javax.swing.*;
import java.awt.*;

public class Calculadora {
    JFrame App = new JFrame();

    Calculadora() {
        App.setTitle("Calculadora");
        App.setExtendedState(JFrame.MAXIMIZED_BOTH);
        App.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App.setLocationRelativeTo(null);
        App.setLayout(null);
    }

    // ===CREAR ELEMENTOS===
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
    JLabel Texto1 = new JLabel("VALOR 1");
    JLabel Texto2 = new JLabel("VALOR 2");
    JLabel Texto3 = new JLabel("VALOR 3");
    JLabel Resultado = new JLabel("Resultado");

    // 3 campos de texto
    JTextField Campo1 = new JTextField();
    JTextField Campo2 = new JTextField();
    JTextField Campo3 = new JTextField();

    void Armar() {
        // ===INSERCION===
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

        // ===POSICION===
        int espaciado = 40;

        // Botones
        int
                anchoBotones1 =         155,
                altoBotones1 =          40,
                limXBotones1 =          80,
                limYBotones1 =          120,
                wBloqueBotones =        anchoBotones1*5,
                pMedioBloqueBotones =   (wBloqueBotones/2)+limXBotones1;

        botonSuma.setBounds(
                limXBotones1,
                limYBotones1,
                anchoBotones1,
                altoBotones1
        );
        botonResta.setBounds(
                (botonSuma.getX() + anchoBotones1),
                limYBotones1,
                anchoBotones1,
                altoBotones1
        );
        botonMultiplicacion.setBounds(
                (botonResta.getX() + anchoBotones1),
                limYBotones1,
                anchoBotones1,
                altoBotones1
        );
        botonDividision.setBounds(
                (botonMultiplicacion.getX() + anchoBotones1),
                limYBotones1,
                anchoBotones1,
                altoBotones1
        );
        botonRaiz.setBounds(
                (botonDividision.getX() + anchoBotones1),
                limYBotones1,
                anchoBotones1,
                altoBotones1
        );

        int
                segundaLinea = (botonSuma.getY() + altoBotones1);
        botonMayor.setBounds(
                limXBotones1,
                segundaLinea,
                anchoBotones1,
                altoBotones1
        );
        botonMenor.setBounds(
                (botonMayor.getX() + anchoBotones1),
                segundaLinea,
                anchoBotones1,
                altoBotones1
        );
        botonPotencia.setBounds(
                (botonMenor.getX() + anchoBotones1),
                segundaLinea,
                anchoBotones1,
                altoBotones1
        );
        botonFactorial.setBounds(
                (botonPotencia.getX() + anchoBotones1),
                segundaLinea,
                anchoBotones1,
                altoBotones1
        );
        botonVolumen.setBounds(
                (botonFactorial.getX() + anchoBotones1),
                segundaLinea,
                anchoBotones1,
                altoBotones1
        );

        botonCalcular.setBounds(
                ( ((anchoBotones1*5) /2) - (botonCalcular.getWidth()/2)),
                400,
                160,
                40
        );

        // Etiquetas
        int
                anchoEtiquetas1 =           150,
                altoEtiquetas1 =            40,
                limXEtiquetas1 =            limXBotones1+pMedioBloqueBotones-anchoEtiquetas1,
                limYEtiquetas1 =            (limYBotones1 + (altoBotones1*2) + espaciado);

        TextoSuperior.setBounds(
                limXBotones1,
                30,
                (anchoBotones1*5),
                60);
        Texto1.setBounds(
                limXEtiquetas1,
                limYEtiquetas1,
                anchoEtiquetas1,
                altoEtiquetas1
        );
        Texto2.setBounds(
                limXEtiquetas1,
                Texto1.getY()+altoEtiquetas1,
                anchoEtiquetas1,
                altoEtiquetas1
        );
        Texto3.setBounds(
                limXEtiquetas1,
                Texto2.getY()+altoEtiquetas1,
                anchoEtiquetas1,
                altoEtiquetas1
        );
        Resultado.setBounds(
                botonCalcular.getX()+(botonCalcular.getWidth()/2)-(anchoEtiquetas1/2),
                botonCalcular.getY()+botonCalcular.getHeight()+espaciado,
                anchoEtiquetas1,
                altoEtiquetas1
                );

        // Campos de texto
        Campo1.setBounds(
                pMedioBloqueBotones,
                limYEtiquetas1,
                anchoEtiquetas1,
                altoEtiquetas1
        );
        Campo2.setBounds(
                pMedioBloqueBotones,
                Campo1.getY()+altoBotones1,
                anchoEtiquetas1,
                altoEtiquetas1
        );
        Campo3.setBounds(
                pMedioBloqueBotones,
                Campo2.getY()+altoBotones1,
                anchoEtiquetas1,
                altoEtiquetas1
        );

        // ===FORMATO===
        TextoSuperior.setFont(new Font("Arial", Font.BOLD,30));
        TextoSuperior.setHorizontalAlignment(JLabel.CENTER);

        // ===VISIBILIDAD===
        App.setVisible(true);
    }
}
