package RFC;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RFC {
    private final JFrame App = new JFrame();
    private final ArrayList<Registro> Historial = new ArrayList<>();
    private int Last = -1;

    RFC() {
        App.setTitle("RFC");
        App.setExtendedState(JFrame.MAXIMIZED_BOTH);
        App.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App.setLocationRelativeTo(null);
        App.setLayout(null);
    }

    // 6 Campos
    JTextField Nombres = new JTextField("");
    JTextField Apellido1 = new JTextField("");
    JTextField Apellido2 = new JTextField("");
    JTextField DD = new JTextField("");
    JTextField MM = new JTextField("");
    JTextField AAAA = new JTextField("");

    // 6 Etiquetas
    JLabel TextoSuperior = new JLabel("Calculadora de RFC");
    JLabel Texto1 = new JLabel("Nombres:");
    JLabel Texto2 = new JLabel("Primer Apellido:");
    JLabel Texto3 = new JLabel("Segundo Apellido:");
    JLabel Texto4 = new JLabel("Fecha de nacimiento (DD/MM/AAAA):");
    JLabel Texto5 = new JLabel("");

    // 2 Botones
    JButton Calcular = new JButton("Calcular");

    public void Armar() {
        App.add(Nombres);
        App.add(Apellido1);
        App.add(Apellido2);
        App.add(DD);
        App.add(MM);
        App.add(AAAA);

        App.add(TextoSuperior);
        App.add(Texto1);
        App.add(Texto2);
        App.add(Texto3);
        App.add(Texto4);
        App.add(Texto5);

        App.add(Calcular);

        TextoSuperior.setBounds(30,30,400,40);
        TextoSuperior.setFont(new Font("Arial",Font.BOLD,40));

        Font FTextos = new Font("Arial", Font.PLAIN,25);

        Texto1.setBounds(30,130,220,50);
        Texto1.setFont(FTextos);
        Nombres.setBounds(250,130,420,45);
        Nombres.setFont(FTextos);

        Texto2.setBounds(30,180,220,50);
        Texto2.setFont(FTextos);
        Apellido1.setBounds(250,180,420,45);
        Apellido1.setFont(FTextos);

        Texto3.setBounds(30,230,220,50);
        Texto3.setFont(FTextos);
        Apellido2.setBounds(250,230,420,45);
        Apellido2.setFont(FTextos);

        Texto4.setBounds(30,280,450,50);
        Texto4.setFont(FTextos);
        DD.setBounds(480,280,50,45);
        DD.setHorizontalAlignment(JTextField.CENTER);
        DD.setFont(FTextos);
        MM.setBounds(535,280,50,45);
        MM.setHorizontalAlignment(JTextField.CENTER);
        MM.setFont(FTextos);
        AAAA.setBounds(590,280,80,45);
        AAAA.setHorizontalAlignment(JTextField.CENTER);
        AAAA.setFont(FTextos);

        Calcular.setBounds(30,335,640,45);
        Calcular.setFont(new Font("Arial", Font.PLAIN,20));

        Texto5.setBounds(30,385,640,50);
        Texto5.setFont(FTextos);
        Texto5.setHorizontalAlignment(JLabel.CENTER);

        Calcular.addActionListener(_ -> {
            if ((Nombres.getText().isEmpty()) || (Apellido1.getText().isEmpty()) || (Apellido2.getText().isEmpty()) ||
            (DD.getText().isEmpty()) || (MM.getText().isEmpty()) || (AAAA.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null,"Error: Informacion Faltante");
            } else {
                Historial.add(new Registro(
                        Nombres.getText(),
                        Apellido1.getText(),
                        Apellido2.getText(),
                        Integer.parseInt(DD.getText()),
                        Integer.parseInt(MM.getText()),
                        Integer.parseInt(AAAA.getText())
                ));
                Nombres.setText(""); Apellido1.setText(""); Apellido2.setText(""); DD.setText(""); MM.setText(""); AAAA.setText("");
                Last ++;
                Texto5.setText("RFC: " + Historial.get(Last).CalcularRFC());
            }
        });

        App.setVisible(true);
    }
}
