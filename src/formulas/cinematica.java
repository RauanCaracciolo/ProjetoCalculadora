package formulas;

public class cinematica {
    double velocidade;
    protected double xInicial;
    double xFinal;
    double tInicial;
    double tFinal;

    public double Sorvetao(){

        return xInicial + velocidade * (tFinal - tInicial);
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getxInicial() {
        return xInicial;
    }

    public void setxInicial(double xInicial) {
        this.xInicial = xInicial;
    }

    public double getxFinal() {
        return xFinal;
    }

    public void setxFinal(double xFinal) {
        this.xFinal = xFinal;
    }

    public double gettInicial() {
        return tInicial;
    }

    public void settInicial(double tInicial) {
        this.tInicial = tInicial;
    }

    public double gettFinal() {
        return tFinal;
    }

    public void settFinal(double tFinal) {
        this.tFinal = tFinal;
    }
}
