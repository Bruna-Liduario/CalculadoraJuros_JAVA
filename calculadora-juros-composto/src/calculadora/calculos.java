package calculadora;

import java.awt.event.ActionEvent;

public class calculos extends calculadoraForm{
    @Override
    protected void btnCalcularClick(ActionEvent ev) {

   }


    @Override
    protected void btnLimparClick(ActionEvent ev) {
        txtCapital.setText("");
        txtJuros.setText("");
        txtPeriodo.setText("");
        txtMontante.setText("");
    }

    @Override
    protected void btnFecharClick(ActionEvent ev) {
        this.setVisible(false);
        this.dispose();
    }
}
