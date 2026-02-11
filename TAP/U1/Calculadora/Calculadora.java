package Calculadora;

import javax.swing.*;
import java.awt.*;

public class Calculadora {
    JFrame App = new JFrame();
    private String Operando = "";
    Operaciones OP = new Operaciones();

    Calculadora() {
        App.setTitle("Calculadora");
        App.setExtendedState(JFrame.MAXIMIZED_BOTH);
        App.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App.setLocationRelativeTo(null);
        App.setLayout(null);
    }

    // ===CREAR ELEMENTOS===
    // 12 botones
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
    JButton botonLimpiar = new JButton("Limpiar");

    // 7 etiquetas
    JLabel TextoSuperior = new JLabel("SELECCIONE OPERACION");
    JLabel TextoLateral = new JLabel("Historial");
    JLabel Texto1 = new JLabel("VALOR 1");
    JLabel Texto2 = new JLabel("VALOR 2");
    JLabel Texto3 = new JLabel("VALOR 3");
    JLabel Resultado = new JLabel("");
    JLabel Operacion = new JLabel("");
    JLabel[] Historial = new JLabel[10];

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
        App.add(botonLimpiar);

        App.add(TextoSuperior);
        App.add(TextoLateral);
        App.add(Texto1);
        App.add(Texto2);
        App.add(Texto3);
        App.add(Resultado);
        App.add(Operacion);

        for (int i = 0; i< Historial.length;i++){
            Historial[i] = new JLabel("---");
            App.add(Historial[i]);
        }

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
                60
        );
        TextoLateral.setBounds(
                TextoSuperior.getX()+TextoSuperior.getWidth()+espaciado,
                TextoSuperior.getHeight(),
                anchoEtiquetas1,
                altoEtiquetas1
        );

        JLabel j = TextoLateral;
        for (JLabel Etiqueta: Historial){
            Etiqueta.setBounds(
                    TextoLateral.getX(),
                    j.getY()+j.getHeight(),
                    anchoEtiquetas1+100,
                    altoEtiquetas1
            );
            j = Etiqueta;
        }
        botonLimpiar.setBounds(
                TextoLateral.getX(),
                Historial[Historial.length-1].getY()+altoEtiquetas1,
                anchoBotones1,
                altoBotones1
        );

        Operacion.setBounds(
                limXBotones1,
                limYEtiquetas1+(altoEtiquetas1*3)+(espaciado/3),
                wBloqueBotones,
                espaciado/3
        );
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
                botonCalcular.getX()+(botonCalcular.getWidth()/2)-(wBloqueBotones/2),
                botonCalcular.getY()+botonCalcular.getHeight()+espaciado,
                wBloqueBotones,
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
        Font FTitulo = new Font("Arial", Font.BOLD,30);
        Font FInfo = new Font("Arial", Font.BOLD,20);

        TextoSuperior.setFont(FTitulo);
        TextoSuperior.setHorizontalAlignment(JLabel.CENTER);

        TextoLateral.setFont(FTitulo);
        Resultado.setFont(FInfo);
        Resultado.setHorizontalAlignment(JLabel.CENTER);

        Operacion.setFont(new Font("Arial", Font.BOLD,espaciado/3));
        Operacion.setHorizontalAlignment(JLabel.CENTER);

        // ===FUNCIONES===
        // Botones

        botonCalcular.addActionListener(c ->{
            switch (Operando) {
                case "SUMA" -> OP.Suma(Campo1,Campo2,Resultado);
                case "RESTA" -> OP.Resta(Campo1,Campo2,Resultado);
                case "MULTIPLICACION" -> OP.Multiplicacion(Campo1,Campo2,Resultado);
                case "DIVISION" -> OP.Division(Campo1,Campo2,Resultado);
                case "RAIZ" -> OP.Raiz(Campo1,Resultado);
                case "MAYOR" -> OP.Mayor(Campo1,Campo2,Resultado);
                case "MENOR" -> OP.Menor(Campo1,Campo2,Resultado);
                case "POTENCIA" -> OP.Potencia(Campo1,Campo2,Resultado);
                case "FACTORIAL" -> OP.Factorial(Campo1,Resultado);
                case "VOLUMEN" -> OP.Volumen(Campo1,Campo2,Campo3,Resultado);
                default -> Resultado.setText("No operacion seleccionada");
            }
            ModifHistorial(Historial,Resultado);
        });
        botonLimpiar.addActionListener(cl->{
            for (JLabel Etiqueta:Historial){
                Etiqueta.setText("---");
            }
        });

        botonSuma.addActionListener(sm->{
            Texto1.setVisible(true); Texto2.setVisible(true); Texto3.setVisible(false);
            Campo1.setVisible(true); Campo2.setVisible(true); Campo3.setVisible(false);
            Operando = "SUMA";
            Operacion.setText("OPERACION ELEGIDA: " + Operando);
        });
        botonResta.addActionListener(rt->{
            Texto1.setVisible(true); Texto2.setVisible(true); Texto3.setVisible(false);
            Campo1.setVisible(true); Campo2.setVisible(true); Campo3.setVisible(false);
            Operando = "RESTA";
            Operacion.setText("OPERACION ELEGIDA: " + Operando);
        });
        botonMultiplicacion.addActionListener(mu->{
            Texto1.setVisible(true); Texto2.setVisible(true); Texto3.setVisible(false);
            Campo1.setVisible(true); Campo2.setVisible(true); Campo3.setVisible(false);
            Operando = "MULTIPLICACION";
            Operacion.setText("OPERACION ELEGIDA: " + Operando);
        });
        botonDividision.addActionListener(dv->{
            Texto1.setVisible(true); Texto2.setVisible(true); Texto3.setVisible(false);
            Campo1.setVisible(true); Campo2.setVisible(true); Campo3.setVisible(false);
            Operando = "DIVISION";
            Operacion.setText("OPERACION ELEGIDA: " + Operando);
        });
        botonRaiz.addActionListener(rz->{
            Texto1.setVisible(true); Texto2.setVisible(false); Texto3.setVisible(false);
            Campo1.setVisible(true); Campo2.setVisible(false); Campo3.setVisible(false);
            Operando = "RAIZ";
            Operacion.setText("OPERACION ELEGIDA: " + Operando);
        });
        botonMayor.addActionListener(my->{
            Texto1.setVisible(true); Texto2.setVisible(true); Texto3.setVisible(false);
            Campo1.setVisible(true); Campo2.setVisible(true); Campo3.setVisible(false);
            Operando = "MAYOR";
            Operacion.setText("OPERACION ELEGIDA: " + Operando);
        });
        botonMenor.addActionListener(mn->{
            Texto1.setVisible(true); Texto2.setVisible(true); Texto3.setVisible(false);
            Campo1.setVisible(true); Campo2.setVisible(true); Campo3.setVisible(false);
            Operando = "MENOR";
            Operacion.setText("OPERACION ELEGIDA: " + Operando);
        });
        botonPotencia.addActionListener(pw->{
            Texto1.setVisible(true); Texto2.setVisible(true); Texto3.setVisible(false);
            Campo1.setVisible(true); Campo2.setVisible(true); Campo3.setVisible(false);
            Operando = "POTENCIA";
            Operacion.setText("OPERACION ELEGIDA: " + Operando);
        });
        botonFactorial.addActionListener(ft->{
            Texto1.setVisible(true); Texto2.setVisible(false); Texto3.setVisible(false);
            Campo1.setVisible(true); Campo2.setVisible(false); Campo3.setVisible(false);
            Operando = "FACTORIAL";
            Operacion.setText("OPERACION ELEGIDA: " + Operando);
        });
        botonVolumen.addActionListener(vo->{
            Texto1.setVisible(true); Texto2.setVisible(true); Texto3.setVisible(true);
            Campo1.setVisible(true); Campo2.setVisible(true); Campo3.setVisible(true);
            Operando = "VOLUMEN";
            Operacion.setText("OPERACION ELEGIDA: " + Operando);
        });

        // ===VISIBILIDAD===
        App.setVisible(true);

        Texto1.setVisible(false);
        Texto2.setVisible(false);
        Texto3.setVisible(false);

        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
    }

    void ModifHistorial(JLabel[] Historial, JLabel Origen) {
        for (int i = 0; i < Historial.length; i++) {
            if (Historial[i].getText().equals("---")){
                Historial[i].setText(Origen.getText());
                return;
            }
        }
    }
}
