package IMC;

import java.math.*;
import javax.swing.*;
import java.awt.*;

public class IMCalc {
    private final JFrame Calc = new JFrame();

    public IMCalc() {
        Calc.setTitle("Calculadora IMC");
        Calc.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Calc.setLocationRelativeTo(null);
        Calc.setLayout(null);
    }
    String[] Rangos = {"Adulto","Menor"};
    JComboBox RangoEdad = new JComboBox(Rangos);

    JLabel Peso = new JLabel("Peso(kg)");
    JLabel Altura = new JLabel("Altura (m)");
    JLabel Rango = new JLabel("Seleccione rango de edad");
    JLabel Output = new JLabel();

    JTextField FPeso = new JTextField();
    JTextField FAltura = new JTextField();

    JButton Calcular = new JButton("Calcular");

    public void Build () {
        Calc.add(RangoEdad);

        Calc.add(Peso);
        Calc.add(Altura);
        Calc.add(Rango);
        Calc.add(Output);

        Calc.add(FPeso);
        Calc.add(FAltura);

        Calc.add(Calcular);

        Font TextoCuerpo = new Font("Arial", Font.PLAIN,25);

        Peso.setBounds(30,30,150,50);
        Peso.setFont(TextoCuerpo);
        FPeso.setBounds(350,30,100,45);
        FPeso.setFont(TextoCuerpo);

        Altura.setBounds(30,80,150,50);
        Altura.setFont(TextoCuerpo);
        FAltura.setBounds(350,80,100,45);
        FAltura.setFont(TextoCuerpo);

        Output.setBounds(30,230,420,50);
        Output.setFont(TextoCuerpo);
/*
        Rango.setBounds(30,130,300,50);
        Rango.setFont(TextoCuerpo);
        RangoEdad.setBounds(350,130,100,45);
        RangoEdad.setFont(TextoCuerpo);
*/
        Calcular.setBounds(30,180,420,45);
        Calcular.setFont(new Font("Arial", Font.PLAIN,15));

        Calcular.addActionListener(_ ->{
            double
                Height = Double.parseDouble(FAltura.getText()),
                Weight = Double.parseDouble(FPeso.getText()),
                IMC = (Weight/(Height*Height));
            BigDecimal bd = new BigDecimal(Double.toString(IMC));
            bd = bd.setScale(1, RoundingMode.HALF_UP);
            double roundedIMC = bd.doubleValue();
            String Out = "IMC = " + roundedIMC;

            FAltura.setText("");
            FPeso.setText("");

            if (IMC < 16.5) {
                Out += " BAJO PESO SEVERO";
            } else if (IMC >= 16.5 && IMC < 18.5) {
                Out += " BAJO PESO";
            } else if (IMC >= 18.5 && IMC < 25) {
                Out += " NORMOPESO";
            } else if (IMC >= 25 && IMC < 26) {
                Out += " SOBREPESO I";
            } else if (IMC >= 27 && IMC < 30) {
                Out += " SOBREPESO II";
            } else if (IMC >= 30 && IMC < 35) {
                Out += " OBESIDAD I";
            } else if (IMC >= 25 && IMC < 40) {
                Out += " OBESIDAD II";
            } else if (IMC >= 40) {
                Out += " OBESIDAD MORBIDA";
            }

            Output.setText(Out);
        });

        Calc.setVisible(true);
    }
}
