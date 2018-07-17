import java.util.ArrayList;
import java.util.List;

public class Grado {
    private String nameGrado;
    private List<Estudiante> estudiantes = new ArrayList<>();

    public Grado(String nameGrado) {
        this.nameGrado = nameGrado;
    }

    public String getNameGrado() {
        return nameGrado;
    }

    public void setNameGrado(String nameGrado) {
        this.nameGrado = nameGrado;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiante(Estudiante estudiantes) {
        this.estudiantes.add(estudiantes);
    }

    @Override
    public String toString() {
        return ""+nameGrado;
    }
}
