package formulas.Mecanica.dinamica;

public class dinamica {
    public double getForcaResultante() {
        return forcaResultante;
    }

    public void setForcaResultante(double forcaResultante) {
        this.forcaResultante = forcaResultante;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    double forcaResultante, forca,  massa, aceleracao;
}
