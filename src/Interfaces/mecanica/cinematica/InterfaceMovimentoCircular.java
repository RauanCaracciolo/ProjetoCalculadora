package Interfaces.mecanica.cinematica;

import Interfaces.interfaceInicial;
import formulas.Mecanica.cinematica.movimentoCircular;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceMovimentoCircular extends JFrame implements ActionListener {
    private JLabel labelRaio, labelPosicaoInicial, labelPosicaoFinal, labelDeslocamentoAngular, labelVelocidade, labelInstanteInicial, labelInstanteFinal, labelPi;
    private JTextArea areaRaio, areaPosicaoInicial, areaPosicaoFinal, areaDeslocamentoAngular, areaVelocidade, areaInstanteInicial, areaInstanteFinal, areaPi;
    private JButton botaoVoltar, botaoEnviar;
    private JComboBox seletorMovimentoCircular;
    public InterfaceMovimentoCircular(){
        setTitle("Calculadora Movimento Circular");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        labelRaio = new JLabel("Raio: ");
        labelRaio.setBounds(120, 0, 80, 30);
        add(labelRaio);

        areaRaio =  new JTextArea("0");
        areaRaio.setBounds(200, 5, 250, 20);
        add(areaRaio);

        labelDeslocamentoAngular = new JLabel("Desloc angular: ");
        labelDeslocamentoAngular.setBounds(120, 40, 80, 30);
        add(labelDeslocamentoAngular);

        areaDeslocamentoAngular = new JTextArea("0");
        areaDeslocamentoAngular.setBounds(200, 45, 250, 20);
        add(areaDeslocamentoAngular);

        labelInstanteInicial = new JLabel("Instante Ini: ");
        labelInstanteInicial.setBounds(120, 80, 80, 30);
        add(labelInstanteInicial);

        areaInstanteInicial = new JTextArea("0");
        areaInstanteInicial.setBounds(200, 85, 250, 20);
        add(areaInstanteInicial);

        labelInstanteFinal = new JLabel("Instante Fim: ");
        labelInstanteFinal.setBounds(120, 120, 80, 30);
        add(labelInstanteFinal);

        areaInstanteFinal = new JTextArea("0");
        areaInstanteFinal.setBounds(200, 125, 250, 20);
        add(areaInstanteFinal);

        labelPosicaoInicial = new JLabel("Posicao ini: ");
        labelPosicaoInicial.setBounds(120, 160, 80, 30);
        add(labelPosicaoInicial);

        areaPosicaoInicial = new JTextArea("0");
        areaPosicaoInicial.setBounds(200, 165, 250, 20);
        add(areaPosicaoInicial);

        labelPosicaoFinal = new JLabel("Posicao fim: ");
        labelPosicaoFinal.setBounds(120, 200, 80, 30);
        add(labelPosicaoFinal);

        areaPosicaoFinal = new JTextArea("0");
        areaPosicaoFinal.setBounds(200, 205, 250, 20);
        add(areaPosicaoFinal);

        labelVelocidade = new JLabel("Velocidade: ");
        labelVelocidade.setBounds(120, 240, 80, 30);
        add(labelVelocidade);

        areaVelocidade = new JTextArea("0");
        areaVelocidade.setBounds(200, 245, 250, 20);
        add(areaVelocidade);

        seletorMovimentoCircular = new JComboBox<>();
        seletorMovimentoCircular.addItem("1 - Posição Angular");
        seletorMovimentoCircular.addItem("2 - Deslocamento Angular");
        seletorMovimentoCircular.addItem("3 - Velocidade Angular média");
        seletorMovimentoCircular.addItem("4 - Aceleração Centripeta");
        seletorMovimentoCircular.addItem("5 - Aceleração Angular média");
        seletorMovimentoCircular.setBounds(175, 280, 250, 30);
        add(seletorMovimentoCircular);

        botaoVoltar = new JButton("Voltar");
        botaoVoltar.setBounds(200, 320,80, 30);
        botaoVoltar.addActionListener(this::voltar);
        add(botaoVoltar);

        botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(300, 320, 80, 30);
        botaoEnviar.addActionListener(this::calcula);
        add(botaoEnviar);

        setVisible(true);

    }

    private void voltar(ActionEvent actionEvent) {
        dispose();
        new interfaceInicial();
    }

    private void calcula(ActionEvent actionEvent) {
        movimentoCircular form = new movimentoCircular();
        form.setRaio(Double.parseDouble(areaRaio.getText()));
        form.setDeslocamentoAngular(Double.parseDouble(areaDeslocamentoAngular.getText()));
        form.settInicial(Double.parseDouble(areaInstanteInicial.getText()));
        form.settFinal(Double.parseDouble(areaInstanteFinal.getText()));
        form.setxInicial(Double.parseDouble(areaPosicaoInicial.getText()));
        form.setxFinal(Double.parseDouble(areaPosicaoFinal.getText()));
        form.setVelocidade(Double.parseDouble(areaVelocidade.getText()));
        switch (seletorMovimentoCircular.getSelectedIndex()){
            case 0:
                JOptionPane.showMessageDialog(null,"Posição Angular:" + form.formulaPosicaoAngular());
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Deslocamento angular: "+ form.formulaDeslocamentoAngular());
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Velocidade angular média: " + form.formulaVelocidadeAngularMedia());
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Aceleração centripeta: " + form.formulaAceleracaoCentripeta());
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Aceleração Angular média: " + form.formulaAceleracaoAngularMedia());
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
