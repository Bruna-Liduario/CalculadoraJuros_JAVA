package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class calculadoraForm extends JFrame {

    //variável do tamanho de campos de preenchimento.
    private static final int TAMANHO_TXT = 15;

    //Campos formulario e Rodape
    protected JPanel pnlForm;
    protected JPanel pnlRodape;

    //botões do rodapé
    protected JButton btnCalcular;
    protected JButton btnLimpar;
    protected JButton btnFechar;


    //Todos dados para cálculo
    //Cálculo capital
    protected JLabel lblCapital;
    protected JTextField txtCapital;

    //Cálculo taxa de juros
    protected JLabel lblJuros;
    protected JTextField txtJuros;

    //Cálculo periodo
    protected JLabel lblPeriodo;
    protected JTextField txtPeriodo;

    //Cálculo montante
    protected JLabel lblMontante;
    protected JTextField txtMontante;


    public calculadoraForm() {
        this.inicializar();
        this.eventos();
    }

    private void inicializar() {

        this.setTitle("Calculadora Juros Composto"); //tela geral

        // antes tinha utilizado esse código para definir o tamanho da tela= this.setSize(640,480);
        //depois utilizou método pack para a tela se ajustar ao tamanho dos componentes automaticamente. Colocar depois de tudo adicionado.

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Para conseguir fechar a aplicação

        this.setResizable(false);//não deixa maximizar a tela

        //Para adicionar Layout tela ContentPane:

        this.getContentPane().setLayout(new BorderLayout());//Layout da tela principal
        this.getContentPane().add(getPnlForm(),BorderLayout.CENTER); //criando o layout do Painel
        this.getContentPane().add(getPnlRodape(),BorderLayout.PAGE_END);//criando o layout do rodapé

        this.pack();//tamanho da tela automático utilizando método pack
    }

    protected abstract void btnCalcularClick(ActionEvent ev);
    protected abstract void btnLimparClick(ActionEvent ev);
    protected abstract void btnFecharClick(ActionEvent ev);
    private void eventos() {
        btnCalcular.addActionListener(this::btnCalcularClick);
        btnLimpar.addActionListener(this::btnLimparClick);
        btnFechar.addActionListener(this::btnFecharClick);
    }

    public JPanel getPnlForm(){
        if (pnlForm == null) {
            pnlForm = new JPanel(new GridLayout(4,2));

            lblCapital = new JLabel("Capital");
            txtCapital = new JTextField(TAMANHO_TXT);

            lblJuros = new JLabel("Juros");
            txtJuros = new JTextField(TAMANHO_TXT);

            lblPeriodo = new JLabel("Período");
            txtPeriodo = new JTextField(TAMANHO_TXT);

            lblMontante = new JLabel("Montante");
            txtMontante = new JTextField(TAMANHO_TXT);
            txtMontante.setEditable(false);

            pnlForm.add(lblCapital);
            pnlForm.add(txtCapital);

            pnlForm.add(lblJuros);
            pnlForm.add(txtJuros);

            pnlForm.add(lblPeriodo);
            pnlForm.add(txtPeriodo);

            pnlForm.add(lblMontante);
            pnlForm.add(txtMontante);
        }
        return pnlForm;
    }
    public JPanel getPnlRodape(){
        if (pnlRodape == null) {
           pnlRodape = new JPanel(new FlowLayout(FlowLayout.CENTER));

           btnCalcular = new JButton("Calcular");
           btnLimpar = new JButton("Limpar");
           btnFechar = new JButton("Fechar");

           pnlRodape.add(btnCalcular);
           pnlRodape.add(btnLimpar);
           pnlRodape.add(btnFechar);
        }
        return pnlRodape;
    }
}
