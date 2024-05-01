import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class AberturaPontoTarefa implements ITarefa {
    private static final Logger LOGGER = Logger.getLogger(AberturaPontoTarefa.class.getName());

    private final Ponto ponto;

    public AberturaPontoTarefa(Ponto ponto) {
        this.ponto = ponto;
    }

    @Override
    public void executar() {
        ponto.abrirPonto();
        LOGGER.log(Level.INFO, "Ponto aberto para funcionário: " + ponto.getFuncionario());
    }

    @Override
    public void cancelar() {
        LOGGER.log(Level.WARNING, "Cancelando abertura do ponto para funcionário: " + ponto.getFuncionario());
        ponto.fecharPonto();
    }
}
