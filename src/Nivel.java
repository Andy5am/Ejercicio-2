import java.util.ArrayList;
import java.util.List;

public class Nivel {
    private String namenivel;
    private List<Grado> Listagrados = new ArrayList<>();

    public String getNamenivel() {
        return namenivel;
    }


    public List<Grado> getGrados() {
        return Listagrados;
    }

    public void setGrados(Grado grados) {
        this.Listagrados.add(grados);
    }

    public Nivel(String namenivel) {
        this.namenivel = namenivel;
    }

    @Override
    public String toString() {
        return ""+namenivel;
    }
}
