package formulas.Mecanica.cinematica;

public class movimentoCircular extends cinematica{
    private double raio;
    private double deslocamentoAngular;
    private double aceleracaoAngular;
    private double velocidadeAngular;
    private double velocidadeCentripeta;
    private double aceleracaoCentripeta;


    public double formulaPosicaoAngular(){
        deslocamentoAngular = xFinal/raio;
        return deslocamentoAngular;
    }
    public double formulaDeslocamentoAngular(){
        deslocamentoAngular = (xFinal - xInicial)/raio;
        return deslocamentoAngular;
    }
    public double formulaVelocidadeAngularMedia(){
        velocidadeAngular = deslocamentoAngular/ (tFinal-tInicial);
        return velocidadeAngular;
    }
    public double formulaAceleracaoCentripeta(){
        aceleracaoCentripeta = (velocidade * velocidade) /raio;
        return aceleracaoCentripeta;
    }
    public double formulaAceleracaoAngularMedia(){
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
