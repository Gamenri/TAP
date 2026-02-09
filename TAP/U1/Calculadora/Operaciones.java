package Calculadora;

import javax.swing.*;

/* Clase que contiene las funciones que llevan a cabo todas las operaciones matematicas y maneja la reescritura de
   elementos en el frame
*/

public class Operaciones {

    public double FieldToDouble(JTextField target) {
        return Double.parseDouble(target.getText());
    }

    public void Suma(JTextField A, JTextField B, JLabel output) {
        double suma, a, b;
        a = FieldToDouble(A);
        b = FieldToDouble(B);
        suma = a+b;

        output.setText("La suma de " + a  + " + " + b + " es " + suma);
    }

    public void Resta(JTextField A, JTextField B, JLabel output) {
        double resta, a, b;
        a = FieldToDouble(A);
        b = FieldToDouble(B);
        resta = a-b;

        output.setText("La resta de " + a  + " - " + b + " es " + resta);
    }

    public void Multiplicacion(JTextField A, JTextField B, JLabel output) {
        double mutliplicacion, a, b;
        a = FieldToDouble(A);
        b = FieldToDouble(B);
        mutliplicacion = a*b;

        output.setText("La multiplicacion de " + a  + " x " + b + " es " + mutliplicacion);
    }

    public void Division(JTextField A, JTextField B, JLabel output) {
        double division, a, b;
        a = FieldToDouble(A);
        b = FieldToDouble(B);
        division = a/b;

        output.setText("La division de " + a  + " / " + b + " es " + division);
    }

    public void Raiz(JTextField A, JLabel output) {
        double raiz, a;
        a = FieldToDouble(A);
        raiz = Math.sqrt(a);

        output.setText("La raiz de " + a  + " es " + raiz);
    }

    public void Mayor(JTextField A, JTextField B, JLabel output) {
        double a, b;
        a = FieldToDouble(A);
        b = FieldToDouble(B);

        if (a > b) {
            output.setText(a + " es mayor que " + b);
        } else if (b > a) {
            output.setText(b + " es mayor que " + a);
        } else {
            output.setText(a + " y " + b + " son iguales");
        }
    }

    public void Menor(JTextField A, JTextField B, JLabel output) {
        double a, b;
        a = FieldToDouble(A);
        b = FieldToDouble(B);

        if (a > b) {
            output.setText(a + " es menor que " + b);
        } else if (b > a) {
            output.setText(b + " es menor que " + a);
        } else {
            output.setText(a + " y " + b + " son iguales");
        }
    }

    public void Potencia(JTextField A, JTextField B, JLabel output) {
        double potencia, a, b;
        a = FieldToDouble(A);
        b = FieldToDouble(B);
        potencia = Math.pow(b,a);

        output.setText("La potencia " + a  + " de " + potencia);
    }

    public void Factorial(JTextField A, JLabel output) {
        double factorial = 1, a;
        a = FieldToDouble(A);

        for(int i=1;i<=a;i++){
            factorial=factorial*i;
        }

        output.setText("El factorial de " + a  + " es " + factorial);
    }

    public void Volumen(JTextField A, JTextField B, JTextField C, JLabel output) {
        double volumen, a, b, c;
        a = FieldToDouble(A);
        b = FieldToDouble(B);
        c = FieldToDouble(C);
        volumen = a*b*c;

        output.setText("El volumen de " + a  + " x " + b  + " x " + c  + " es " + volumen);
    }
}
