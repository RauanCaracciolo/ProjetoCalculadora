package Interfaces.cinematica;

import formulas.cinematica.movimentoUniforme;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceMovimentoUniforme extends JFrame implements  ActionListener{
    private JTextArea areaVelocidade, areaPosicaoi, areaPosicaof, areaInstantI, areaInstantf;
    private JLabel labelVel, labelPosicaoI, labelPosicaoF, labelInstantI, labelInstantf;
    private JButton botaoEnviar, botaoSair;
    private JComboBox seletorCinematica;


    public InterfaceMovimentoUniforme() {
        setTitle("Interface02");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        labelVel = new JLabel("Velocidade: ");
        labelVel.setBounds(120, 0, 80, 30);
        add(labelVel);

        areaVelocidade = new JTextArea(1, 20);
        areaVelocidade.setBounds(200, 5, 250, 20);
        add(areaVelocidade);

        labelPosicaoI = new JLabel("Posição Ini: ");
        labelPosicaoI.setBounds(120, 40, 80, 30);
        add(labelPosicaoI);

        areaPosicaoi = new JTextArea(1, 20);
        areaPosicaoi.setBounds(200, 45, 250, 20);
        add(areaPosicaoi);

        labelPosicaoF = new JLabel("Posição Fim: ");
        labelPosicaoF.setBounds(120, 80, 80, 30);
        add(labelPosicaoF);

        areaPosicaof = new JTextArea(1, 20);
        areaPosicaof.setBounds(200, 85, 250, 20);
        add(areaPosicaof);

        labelInstantI = new JLabel("Instante Ini: ");
        labelInstantI.setBounds(120, 120, 80, 30);
        add(labelInstantI);

        areaInstantI = new JTextArea(1, 20);
        areaInstantI.setBounds(200, 125, 250, 20);
        add(areaInstantI);

        labelInstantf = new JLabel("Instante Fim: ");
        labelInstantf.setBounds(120, 160, 80, 30);
        add(labelInstantf);

        areaInstantf = new JTextArea(1, 20);
        areaInstantf.setBounds(200, 165, 250, 20);
        add(areaInstantf);

        botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(300, 200, 80, 30);
        add(botaoEnviar);

        botaoSair = new JButton("Sair");
        botaoSair.setBounds(200, 200, 80, 30);
        add(botaoSair);

        seletorCinematica = new JComboBox<>();
        seletorCinematica.addItem("1 - Formula da Velocidade");
        seletorCinematica.addItem("2 - Formula da Posição final");
        seletorCinematica.setBounds(175, 300, 250, 30);
        add(seletorCinematica);

        setVisible(true);
        botaoEnviar.addActionListener(this::seletorFormula);
        }
        private void seletorFormula(ActionEvent actionEvent) {
            movimentoUniforme form = new movimentoUniforme();
            form.setxInicial(Double.parseDouble(areaPosicaoi.getText()));
            form.setxFinal(Double.parseDouble(areaPosicaof.getText()));
            form.settInicial(Double.parseDouble(areaInstantI.getText()));
            form.settFinal(Double.parseDouble(areaInstantf.getText()));
            form.setVelocidade(Double.parseDouble(areaVelocidade.getText()));
            if (seletorCinematica.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Velocidade: " + form.formulaVelocidade() + "m/s");
            }else if(seletorCinematica.getSelectedIndex() == 1){
                JOptionPane.showMessageDialog(null, "Posição final: " + form.formulaFuncaoHorariaDeslocamento() + "metros");
            }
            }


        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Enviado");

        }
    }

