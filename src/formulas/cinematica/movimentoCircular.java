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
    public static void calculaPosicaoAngular(){
        Scanner scan = new Scanner(System.in);
        System.out.println("******** CALCULADORA PA ********");
        System.out.println("Digite a posicao: ");
        double posicao = scan.nextDouble();
        System.out.println("Digite o raio: ");
        double raio = scan.nextDouble();
        movimentoCircular formula = new movimentoCircular();
        formula.setxFinal(posicao);
        formula.setRaio(raio);
        System.out.println("Posição angular: "+ formula.formulaPosicaoAngular());
    }
    public static void calculaDeslocamentoAngular() {
        Scanner scan = new Scanner(System.in);
        System.out.println("******** CALCULADORA DA ********");
        System.out.println("Digite a posicao final: ");
        double posicaoFinal = scan.nextDouble();
        System.out.println("Digite a posicao inicial: ");
        double posicaoInicial = scan.nextDouble();
        System.out.println("Digite o raio: ");
        double raio = scan.nextDouble();
        movimentoCircular formula = new movimentoCircular();
        formula.setxFinal(posicaoFinal);
        formula.setxInicial(posicaoInicial);
        formula.setRaio(raio);
        System.out.println("Deslocamento angular: " + formula.formulaDeslocamentoAngular());
    }
    public static void calculaVelocidadeAngularMedia(){
        Scanner scan = new Scanner(System.in);
        System.out.println("******** CALCULADORA VAM ********");
        System.out.println("Digite o deslocamento angular: ");
        double deslocamentoAngular = scan.nextDouble();
        System.out.println("Digite o instante final: ");
        double instanteFinal = scan.nextDouble();
        System.out.println("Digite o instante inicial: ");
        double instanteInicial = scan.nextDouble();
        movimentoCircular formula = new movimentoCircular();
        formula.setDeslocamentoAngular(deslocamentoAngular);
        formula.settFinal(instanteFinal);
        formula.settInicial(instanteInicial);
        System.out.println("Velocidade angular média: " + formula.formulaVelocidadeAngularMedia());
    }
    public static void calculaAceleracaoCentripeta(){
        Scanner scan = new Scanner(System.in);
        System.out.println("******** Calculadora ACC ********");
        System.out.println("Digite a velocidade: ");
        double velocidade = scan.nextDouble();
        System.out.println("Digite o raio: ");
        double raio = scan.nextDouble();
        movimentoCircular formula = new movimentoCircular();
        formula.setVelocidade(velocidade);
        formula.setRaio(raio);
        System.out.println("Aceleração centripeta: " + formula.formulaAceleracaoCentripeta());
    }
    public static void calculaAceleracaoAngularMedia(){
        Scanner scan = new Scanner(System.in);
        System.out.println("******** CALCULADORA AAM ********");
        System.out.println("Digite a velocidade angular: ");
        double velocidadeAngular = scan.nextDouble();
        System.out.println("Digite o instante inicial: ");
        double instanteInicial = scan.nextDouble();
        System.out.println("Digite o instante final: ");
        double instanteFinal = scan.nextDouble();
        movimentoCircular formula = new movimentoCircular();
        formula.setVelocidadeAngular(velocidadeAngular);
        formula.settInicial(instanteInicial);
        formula.settFinal(instanteFinal);
        System.out.println("Aceleração angular média: " + formula.formulaAceleracaoAngularMedia());
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
