import java.util.List;

public class Grado {
    private String nameGrado;
    private List<String> estudiantes;

    public Grado(String nameGrado) {
        this.nameGrado = nameGrado;
    }

    public String getNameGrado() {
        return nameGrado;
    }

    public void setNameGrado(String nameGrado) {
        this.nameGrado = nameGrado;
    }

    public List<String> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiante(Estudiante estudiantes) {
        this.estudiantes.add(Estudiante) = estudiantes;
    }
}
