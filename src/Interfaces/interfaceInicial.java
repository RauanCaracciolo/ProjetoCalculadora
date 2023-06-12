package Interfaces;
import Interfaces.mecanica.cinematica.InterfaceMovimentoCircular;
import Interfaces.mecanica.cinematica.InterfaceMovimentoUniforme;
import Interfaces.mecanica.cinematica.InterfaceMovimentoUnifromementeVariado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaceInicial extends JFrame implements ActionListener {
    JLabel apresentacao, textoParaSelect;
    JComboBox selecaoGeral, selecaoCinematica;
    public interfaceInicial(){
        setTitle("Calculadora de fisíca");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        selecaoGeral = new JComboBox<>();
        selecaoGeral.addItem("Selecione um tema:");
        selecaoGeral.addItem("Mecanica");
        selecaoGeral.addItem("Termodinamica");
        selecaoGeral.setBounds(200, 100, 200, 30);
        selecaoGeral.setSelectedIndex(0);
        selecaoGeral.addActionListener(this::selecao);
        add(selecaoGeral);

        apresentacao = new JLabel("Esse programa foi criado por Rauan Caracciolo, para treinar Java e programação orientada a Objetos.");
        apresentacao.setBounds(5, 300, 600, 100);
        add(apresentacao);

        setVisible(true);

    }

    private void selecao(ActionEvent actionEvent) {
        switch (selecaoGeral.getSelectedIndex()){
            case 0:
                new interfaceInicial();
                break;
            case 1:
                selecaoCinematica = new JComboBox<>();
                selecaoCinematica.addItem("Movimento Uniforme");
                selecaoCinematica.addItem("Movimento Uniformemente Variado");
                selecaoCinematica.addItem("Movimento Circular");
                selecaoCinematica.setBounds(200, 200, 200, 30);
                selecaoCinematica.addActionListener(this::cinematica);
                add(selecaoCinematica);
                break;
            case 2:
                new InterfaceMovimentoUnifromementeVariado();
                break;
        }
    }

    private void cinematica(ActionEvent actionEvent) {
        switch (selecaoCinematica.getSelectedIndex()){
            case 0:
                new InterfaceMovimentoUniforme();
                dispose();
                break;
            case 1:
                new InterfaceMovimentoUnifromementeVariado();
                dispose();
                break;
            case 2:
                new InterfaceMovimentoCircular();
                dispose();
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
