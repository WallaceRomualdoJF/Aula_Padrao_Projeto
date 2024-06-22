import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ObjetoCompartilhado {
    private ObjetoCompartilhado() { }

    private String currentVersion;

    @Getter
    private static final ObjetoCompartilhado sharedObject = new ObjetoCompartilhado();
}
