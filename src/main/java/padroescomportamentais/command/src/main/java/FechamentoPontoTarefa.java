import java.util.logging.Level;
import java.util.logging.Logger;

class FechamentoPontoTarefa implements ITarefa {
    private static final Logger LOGGER = Logger.getLogger(FechamentoPontoTarefa.class.getName());

    private final Ponto ponto;

    public FechamentoPontoTarefa(Ponto ponto) {
        this.ponto = ponto;
    }

    @Override
    public void executar() {
        ponto.fecharPonto();
        LOGGER.log(Level.INFO, "Ponto fechado para funcionário: " + ponto.getFuncionario());
    }

    @Override
    public void cancelar() {
        LOGGER.log(Level.WARNING, "Cancelando fechamento do ponto para funcionário: " + ponto.getFuncionario());
        ponto.abrirPonto();
    }
}
