import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteObjetoCompartilhado {
    @Test
    public void shouldReturnCurrentVersion() {
        var version = "1.0.0";
        ObjetoCompartilhado.getSharedObject().setCurrentVersion(version);
        assertEquals(version, ObjetoCompartilhado.getSharedObject().getCurrentVersion());
    }
}
