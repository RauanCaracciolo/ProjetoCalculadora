import formulas.cinematica.movimentoCircular;
import formulas.cinematica.movimentoUniforme;
import formulas.cinematica.movimentoUniformementeVariado;
import Interfaces.cinematica.InterfaceMovimentoUniforme;
public class Main {
    public static void main(String[] args) {
        new InterfaceMovimentoUniforme();
        // Funcoes de cinematica
        // Calcula a funcao horaria do deslocamento uniforme:
        // movimentoUniforme.calculaFuncaoHoraraDoDeslocamento();


        // Funcoes de Movimento uniformemente Variado
        // Calcula funcao horaria velocidade :
        // movimentoUniformementeVariado.calculaFuncaoHorariaVelocidade();
        // Calcula funcao horaria da posicao : movimentoUniformementeVariado.calculaFuncaoHorariaPosicao();
        // movimentoUniformementeVariado.calculaFormulaTorricelli();

        // Funcoes movimento circular
        // movimentoCircular.calculaPosicaoAngular();
        // movimentoCircular.calculaDeslocamentoAngular();
        // movimentoCircular.calculaVelocidadeAngularMedia();
        // movimentoCircular.calculaAceleracaoCentripeta();
        // movimentoCircular.calculaAceleracaoAngularMedia();
    }
}


