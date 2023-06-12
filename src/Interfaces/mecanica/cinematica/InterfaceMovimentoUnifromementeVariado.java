package Interfaces.mecanica.cinematica;

import Interfaces.interfaceInicial;
import formulas.Mecanica.cinematica.movimentoUniformementeVariado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceMovimentoUnifromementeVariado extends JFrame implements ActionListener {
    private JTextArea areaVelocidade, areaPosicaoi, areaPosicaof, areaInstantI, areaInstantf, areaAceleracao;
    private JLabel labelVel, labelPosicaoI, labelPosicaoF, labelInstantI, labelInstantf, labelAceleracao;
    private JButton botaoEnviar, botaoSair;
    private JComboBox seletorCinematica;

    public InterfaceMovimentoUnifromementeVariado() {
        setTitle("Calculadora Movimento Uniforme");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        labelVel = new JLabel("Velocidade: ");
        labelVel.setBounds(120, 0, 80, 30);
        add(labelVel);

        areaVelocidade = new JTextArea("0",1, 20);
        areaVelocidade.setBounds(200, 5, 250, 20);
        add(areaVelocidade);

        labelPosicaoI = new JLabel("Posição Ini: ");
        labelPosicaoI.setBounds(120, 40, 80, 30);
        add(labelPosicaoI);

        areaPosicaoi = new JTextArea("0", 1, 20);
        areaPosicaoi.setBounds(200, 45, 250, 20);
        add(areaPosicaoi);

        labelPosicaoF = new JLabel("Posição Fim: ");
        labelPosicaoF.setBounds(120, 80, 80, 30);
        add(labelPosicaoF);

        areaPosicaof = new JTextArea("0",1, 20);
        areaPosicaof.setBounds(200, 85, 250, 20);
        add(areaPosicaof);

        labelInstantI = new JLabel("Instante Ini: ");
        labelInstantI.setBounds(120, 120, 80, 30);
        add(labelInstantI);

        areaInstantI = new JTextArea("0", 1, 20);
        areaInstantI.setBounds(200, 125, 250, 20);
        add(areaInstantI);

        labelInstantf = new JLabel("Instante Fim: ");
        labelInstantf.setBounds(120, 160, 80, 30);
        add(labelInstantf);

        areaInstantf = new JTextArea("0",1, 20);
        areaInstantf.setBounds(200, 165, 250, 20);
        add(areaInstantf);

        labelAceleracao = new JLabel("Aceleração: ");
        labelAceleracao.setBounds(120, 200, 80, 30);
        add(labelAceleracao);

        areaAceleracao = new JTextArea("0",1, 20);
        areaAceleracao.setBounds(200, 205, 250, 20);
        add(areaAceleracao);

        botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(300, 240, 80, 30);
        add(botaoEnviar);

        botaoSair = new JButton("Sair");
        botaoSair.setBounds(200, 240, 80, 30);
        add(botaoSair);

        seletorCinematica = new JComboBox<>();
        seletorCinematica.addItem("1 - Achar Velocidade Final: ");
        seletorCinematica.addItem("2 - Achar Posição final: ");
        seletorCinematica.addItem("3 - Velocidade com Toricelli: ");
        //seletorCinematica.addItem("4 - Achar Intervalo de Tempo");
        seletorCinematica.setBounds(175, 300, 250, 30);
        add(seletorCinematica);

        setVisible(true);
        botaoEnviar.addActionListener(this::seletorFormula);
        botaoSair.addActionListener(this::FechaAPP);
    }

    private void seletorFormula(ActionEvent actionEvent) {
        movimentoUniformementeVariado form = new movimentoUniformementeVariado();
        form.setxInicial(Double.parseDouble(areaPosicaoi.getText()));
        form.setxFinal(Double.parseDouble(areaPosicaof.getText()));
        form.settInicial(Double.parseDouble(areaInstantI.getText()));
        form.settFinal(Double.parseDouble(areaInstantf.getText()));
        form.setVelocidade(Double.parseDouble(areaVelocidade.getText()));
        form.setAceleracao(Double.parseDouble(areaAceleracao.getText()));
        switch (seletorCinematica.getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Velocidade final: " + form.formulaFHV() + "m/s");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Posição final: " + form.formulaFHP() + "metros");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Posição inicial: " + form.formulaTorricelli() + " metros");
                break;

        }
    }
    private void FechaAPP(ActionEvent actionEvent){
        dispose();
        new interfaceInicial();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}