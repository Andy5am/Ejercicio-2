import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static String getMenu (){
        return "Menu:\n" +
                "\t1. Agregar nivel\n" +
                "\t2. Agregar grado\n" +
                "\t3. Agregar estudiante\n" +
                "\t4. Ver grados en nivel\n" +
                "\t5. Ver asignaciones en grado\n" +
                "\t6. Salir\n";
    }





    public static void main (String[] args) {

        List<Nivel> Niveles = new ArrayList<>();
        boolean control = true;
        do {

            System.out.println(getMenu());
            System.out.println("Ingrese la opcion deseada:");
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingrese el nombre del nivel:");
                    input = new Scanner(System.in);
                    String Nombre = input.nextLine();
                    Niveles.add(new Nivel (Nombre));

                    break;
                case 2:
                    System.out.println("Ingrese el nombre del nivel al que sera agregado:");
                    input = new Scanner(System.in);
                    String nivel = input.nextLine();
                    for (Nivel a : Niveles){
                        if(nivel.equals(a.getNamenivel())) {
                            System.out.println("Ingrese el nombre del grado:");
                            input = new Scanner(System.in);
                            String grado = input.nextLine();
                            a.setGrados(new Grado(grado));

                        }else {
                            System.out.println("No existe el nivel");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del nivel:");
                    input = new Scanner(System.in);
                    String nivel1 = input.nextLine();
                    for (Nivel a : Niveles) {
                        if(a.getNamenivel().equals(nivel1)) {
                            System.out.println("Ingrese el nombre del grado:");
                            input = new Scanner(System.in);
                            String grado = input.nextLine();
                            List<Grado> Grados = a.getGrados();
                            for (Grado b : Grados) {
                                if (b.getNameGrado().equals(grado)) {
                                    System.out.println("Ingrese el nombre del estudiante:");
                                    input = new Scanner(System.in);
                                    String estudiante = input.nextLine();
                                    System.out.println("Ingrese el codigo del estudiante");
                                    input = new Scanner(System.in);
                                    int codigo = input.nextInt();
                                    b.setEstudiante(new Estudiante(codigo, estudiante));
                                } else {
                                    System.out.println("No se encuentra el grado");
                                }
                            }
                        } else {
                            System.out.println("No existe el nivel");
                        }
                    }

                    break;
                case 4:
                    System.out.println("Ingrese el nombre del nivel:");
                    input = new Scanner(System.in);
                    String nivel2 = input.nextLine();
                    for (Nivel c : Niveles) {
                        if (c.getNamenivel().equals(nivel2)) {
                            System.out.println("Los grados en "+ nivel2+" son:"+c.getGrados());

                        }else {
                            System.out.println("No existe ese grado");
                        }
                    }

                    break;
                case 5:
                    System.out.println("Ingrese el nombre del nivel:");
                    input = new Scanner(System.in);
                    String nivel3 = input.nextLine();
                    for (Nivel a : Niveles) {
                        if(a.getNamenivel().equals(nivel3)) {
                            System.out.println("Ingrese el nombre del grado:");
                            input = new Scanner(System.in);
                            String grado = input.nextLine();
                            List<Grado> Grados = a.getGrados();
                            for (Grado b : Grados) {
                                if (b.getNameGrado().equals(grado)) {
                                    System.out.println("Los estudiantes en "+grado+" son:"+b.getEstudiantes());
                                } else {
                                    System.out.println("No se encuentra el grado");
                                }
                            }
                        } else {
                            System.out.println("NO existe el nivel");
                        }
                    }

                    break;
                case 6:
                    System.out.println("Hasta luego");
                    control = false;
                    break;

            }

        }while (control);

    }
}
