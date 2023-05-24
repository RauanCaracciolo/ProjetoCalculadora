package formulas;

import java.util.Scanner;

public class movimentoUniformementeVariado extends cinematica{
    double aceleracao;
    double velocidadeFinal;


    private double formulaFHV(){
        velocidadeFinal = velocidade + (aceleracao * tFinal);
        return velocidadeFinal;
    }
    private double formulaFHP(){
        return xInicial + velocidade*tFinal + ((aceleracao*(tFinal * tFinal))/2);
    }
    private double formulaTorricelli(){
        velocidadeFinal = (velocidade * velocidade) + (2 * aceleracao * (xFinal - xInicial));
        return Math.sqrt(velocidadeFinal);
    }
    public static void calculaFuncaoHorariaVelocidade(){
        Scanner scan = new Scanner(System.in);
        System.out.println("******** CALCULADORA FHV ********");
        System.out.println("Digite a velocidade Inicial: ");
        double velocidadeIni = scan.nextDouble();
        System.out.println("Digite a aceleraçao: ");
        double aceleracao = scan.nextDouble();
        System.out.println("Digite o intervalo de tempo: ");
        double deltaT = scan.nextDouble();
        movimentoUniformementeVariado formula = new movimentoUniformementeVariado();
        formula.setVelocidade(velocidadeIni);
        formula.setAceleracao(aceleracao);
        formula.settFinal(deltaT);
        System.out.println("Velocidade final: " + formula.formulaFHV());
    }
    public static void calculaFuncaoHorariaPosicao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("******** CALCULADORA FHP ********");
        System.out.println("Digite a velocidade Inicial: ");
        double velocidadeIni = scan.nextDouble();
        System.out.println("Digite a posicao Inicial: ");
        double xInicial = scan.nextDouble();
        System.out.println("Digite o intervalo de tempo: ");
        double tempo = scan.nextDouble();
        System.out.println("Digite a aceleracao: ");
        double aceleracao = scan.nextDouble();
        movimentoUniformementeVariado formula = new movimentoUniformementeVariado();
        formula.setAceleracao(aceleracao);
        formula.settFinal(tempo);
        formula.setVelocidade(velocidadeIni);
        formula.setxInicial(xInicial);
        System.out.println("Posicão final: " + formula.formulaFHP() + " Metros");
    }
    public static void calculaFormulaTorricelli(){
        Scanner scan = new Scanner(System.in);
        System.out.println("******** CALCULADORA TORRICELLI ********");
        System.out.println("Digite a velocidade inicial: ");
        double velocidade = scan.nextDouble();
        System.out.println("Digite a aceleracao: ");
        double aceleracao = scan.nextDouble();
        System.out.println("Digite a posição inicial: ");
        double xInicial = scan.nextDouble();
        System.out.println("Digite a posição finall: ");
        double xFinal = scan.nextDouble();
        movimentoUniformementeVariado formula = new movimentoUniformementeVariado();
        formula.setVelocidade(velocidade);
        formula.setAceleracao(aceleracao);
        formula.setxInicial(xInicial);
        formula.setxFinal(xFinal);
        System.out.println("Velocidade final: " + formula.formulaTorricelli() + "m/s");
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }
}
