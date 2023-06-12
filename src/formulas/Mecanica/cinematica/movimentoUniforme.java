package formulas.Mecanica.cinematica;

public class movimentoUniforme extends cinematica{

    public double formulaVelocidade(){
        velocidade = (xFinal - xInicial) / (tFinal - tInicial);
        return velocidade;
    }

    public double formulaFuncaoHorariaDeslocamento(){
        xFinal =  xInicial + velocidade * (tFinal - tInicial);
        return xFinal;
    }
    public double formulaFHDAcharXInicial(){
        xInicial = xFinal - velocidade*(tFinal - tInicial);
        return xInicial;
    }
    public double formulaFHDAcharIntervaloTempo(){
        tFinal = (xFinal - xInicial)/velocidade;
        return tFinal;
    }

}
