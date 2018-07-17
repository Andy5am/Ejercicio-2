public class Estudiante {
    private int code;
    private String name;


    public Estudiante(int code, String name) {
        this.code = code;
        this.name = name;
    }


    @Override
    public String toString() {
        return ""+name+
        "\n"+code;
    }
}
