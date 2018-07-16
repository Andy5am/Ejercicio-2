import java.util.List;

public class Nivel {
    private String namenivel;
    private List<String> grados;

    public String getNamenivel() {
        return namenivel;
    }

    public void setNamenivel(String namenivel) {
        this.namenivel = namenivel;
    }

    public List<String> getGrados() {
        return grados;
    }

    public void setGrados(Grado grados) {
        this.grados.add(Grado) = grados;
    }

    public Nivel(String namenivel) {
        this.namenivel = namenivel;
    }
}
