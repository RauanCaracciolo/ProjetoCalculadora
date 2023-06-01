package formulas.cinematica;

import java.util.Scanner;

public class movimentoUniforme extends cinematica{

    public double formulaVelocidade(){
        velocidade = (xFinal - xInicial) / (tFinal);
        return velocidade;
    }

    public double formulaFuncaoHorariaDeslocamento(){
        xFinal =  xInicial + velocidade * (tFinal - tInicial);
        return xFinal;
    }
    public static void calculaVelocidade(){
        Scanner scan = new Scanner(System.in);

    }
    public static void calculaFuncaoHoraraDoDeslocamento() {
        Scanner scan = new Scanner(System.in);
        System.out.println("************* CALCULADORA MU *************");
        System.out.println("Digite a velocidade: ");
        double velocidade = scan.nextDouble();
        System.out.println("Digite o instante inicial: ");
        double instanteIni = scan.nextDouble();
        System.out.println("Digite o Instante Final: ");
        double instanteFin = scan.nextDouble();
        System.out.println("Digite a posição inicial: ");
        double posicaoInicial = scan.nextDouble();
        movimentoUniforme formula1 = new movimentoUniforme();
        formula1.settFinal(instanteFin);
        formula1.settInicial(instanteIni);
        formula1.setxInicial(posicaoInicial);
        formula1.setVelocidade(velocidade);
        System.out.println("Deslocamento total: " + formula1.formulaFuncaoHorariaDeslocamento() + " Metros");
    }
}
