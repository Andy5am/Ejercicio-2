import java.util.Scanner;

public class main {

    public static String getMenu (){
        return "Menu:\n" +
                "\t1. Agregar nivel\n" +
                "\t2. Agregar grado\n" +
                "\t3. Agregar estudiante\n" +
                "\t4. Ver grados en nivel\n" +
                "\t5. Ver asignaciones en grado\n" +
                "\t6. Salir\n"
    }





    public static void main (String[] args) {
        do {
            boolean control = true;
            getMenu();
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    control = false
                    break;

            }
        }

    }
}
