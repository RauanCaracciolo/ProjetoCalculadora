package formulas.Mecanica.cinematica;

public class movimentoUniformementeVariado extends cinematica{
    double aceleracao;
    double velocidadeFinal;


    public double formulaFHV(){
        velocidadeFinal = velocidade + (aceleracao * (tFinal - tInicial));
        return velocidadeFinal;
    }
    public double formulaFHP() {
        xFinal= xInicial + velocidade*tFinal + ((aceleracao*(tFinal * tFinal))/2);
        return xFinal;
    }
    public double formulaTorricelli(){
        velocidadeFinal = (velocidade * velocidade) + (2 * aceleracao * (xFinal - xInicial));
        return Math.sqrt(velocidadeFinal);
    }


    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }
}
