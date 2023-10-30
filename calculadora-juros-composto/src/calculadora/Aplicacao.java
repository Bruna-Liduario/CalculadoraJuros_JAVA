package calculadora;

import javax.swing.*;

public class Aplicacao {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            calculos calc = new calculos();
            calc.setVisible(true);
        });
    }
}
