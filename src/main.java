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
                        if(a.getNamenivel()== nivel) {
                            System.out.println("Ingrese el nombre del grado:");
                            input = new Scanner(System.in);
                            String grado = input.nextLine();
                            a.setGrados(new Grado (grado));

                        }else {
                            System.out.println("No existe el nivel");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del nivel:");
                    input = new Scanner(System.in);
                    String estudiante = input.nextLine();
                    for (Nivel a : Niveles) {
                        if(a.getNamenivel()== nivel) {
                            System.out.println("Ingrese el nombre del grado:");
                            input = new Scanner(System.in);
                            String grado = input.nextLine();
                            List<> Grados = new ArrayList<>();


                    }

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    control = false;
                    break;

            }

        }while (!control);

    }
}
