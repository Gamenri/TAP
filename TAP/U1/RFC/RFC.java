package RFC;

import javax.swing.*;

public class RFC {
    JFrame App = new JFrame();


    RFC() {
        App.setTitle("RFC");
        App.setExtendedState(JFrame.MAXIMIZED_BOTH);
        App.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App.setLocationRelativeTo(null);
        App.setLayout(null);
    }

    // 6 Campos
    JTextField Nombres = new JTextField();
    JTextField Apellido1 = new JTextField();
    JTextField Apellido2 = new JTextField();
    JTextField DD = new JTextField();
    JTextField MM = new JTextField();
    JTextField AAAA = new JTextField();

    // 6 Etiquetas
    JLabel TextoSuperior = new JLabel("Calculadora de RFC");
    JLabel Texto1 = new JLabel("Nombres:");
    JLabel Texto2 = new JLabel("Primer Apellido:");
    JLabel Texto3 = new JLabel("Segundo Apellido:");
    JLabel Texto4 = new JLabel("Fecha de nacimiento (DD/MM/AAAA):");

    // 2 Botones
    JButton Calcular = new JButton();
}
