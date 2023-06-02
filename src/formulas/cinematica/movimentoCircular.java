package formulas.cinematica;

import java.util.Scanner;

public class movimentoCircular extends cinematica{
    private double raio;
    private double deslocamentoAngular;
    private double aceleracaoAngular;
    private double velocidadeAngular;
    private double velocidadeCentripeta;
    private double aceleracaoCentripeta;


    private double formulaPosicaoAngular(){
        deslocamentoAngular = xFinal/raio;
        return deslocamentoAngular;
    }
    private double formulaDeslocamentoAngular(){
        deslocamentoAngular = (xFinal - xInicial)/raio;
        return deslocamentoAngular;
    }
    private double formulaVelocidadeAngularMedia(){
        velocidadeAngular = deslocamentoAngular/ (tFinal-tInicial);
        return velocidadeAngular;
    }
    private double formulaAceleracaoCentripeta(){
        aceleracaoCentripeta = (velocidade * velocidade) /raio;
        return aceleracaoCentripeta;
    }
    private double formulaAceleracaoAngularMedia(){
        aceleracaoAngular = velocidadeAngular / (tFinal - tInicial);
        return aceleracaoAngular;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDeslocamentoAngular() {
        return deslocamentoAngular;
    }

    public void setDeslocamentoAngular(double deslocamentoAngular) {
        this.deslocamentoAngular = deslocamentoAngular;
    }

    public double getAceleracaoAngular() {
        return aceleracaoAngular;
    }

    public void setAceleracaoAngular(double aceleracaoAngular) {
        this.aceleracaoAngular = aceleracaoAngular;
    }

    public double getVelocidadeAngular() {
        return velocidadeAngular;
    }

    public void setVelocidadeAngular(double velocidadeAngular) {
        this.velocidadeAngular = velocidadeAngular;
    }

    public double getVelocidadeCentripeta() {
        return velocidadeCentripeta;
    }

    public void setVelocidadeCentripeta(double velocidadeCentripeta) {
        this.velocidadeCentripeta = velocidadeCentripeta;
    }

    public double getAceleracaoCentripeta() {
        return aceleracaoCentripeta;
    }

    public void setAceleracaoCentripeta(double aceleracaoCentripeta) {
        this.aceleracaoCentripeta = aceleracaoCentripeta;
    }

}
