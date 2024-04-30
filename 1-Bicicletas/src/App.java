import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Bicicletas bicicleta = new Bicicletas();
        Scanner scan = new Scanner(System.in);

        boolean validar = false;

        // bicicleta.añadir(scan);
        // bicicleta.añadir(scan);

        // System.out.println(bicicleta.tienda.get(1).getMarca());
        // System.out.println(bicicleta.tienda.get(0).getColor());

        System.out.println("--------------Bienvenido a la colección de Bicicletas para Wallapop--------------");
        System.out.println();

        while (!validar) {

            System.out.println("¿Que quieres hacer ahora?");
            System.out.println("1.-Añadir Bicicleta");
            System.out.println("2.-Ver Bicicleta más cara");
            System.out.println("3.-Eliminar Bicicleta");
            System.out.println("4.-Mostrar Marca de todas las Bicicletas");
            System.out.println("5.-Mostrar todas las Bicicletas");

            System.out.println("6.-Tocar el claxon.");

            System.out.println("0.-Salir");
            System.out.println("----------------------------------------------------------------------------");

            System.out.print("Opción: ");
            int option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 1:
                    bicicleta.añadir(scan);
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------");

                    break;
                case 2:
                    bicicleta.bicicletaMasCara();
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------");
                    break;
                case 3:
                    bicicleta.eliminarBicicleta(scan);
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------");
                    break;

                case 4:
                    bicicleta.mostrarTodasMarcas();
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------");
                    break;
                case 5:
                    bicicleta.mostrarTodas();
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------");
                    break;
                case 6:
                    bicicleta.tocarClaxon();
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------");
                    break;
                case 0:
                    validar = true;
                    break;

                default:

                    System.out.println();
                    System.out.println("Introduce una de las 4 opciones disponibles.");
                    System.out.println("----------------------------------------------------------------------------");
                    break;
            }

        }

    }
}

// # 16.2-POO.2

// Instructions

// - Puedes añadir métodos: tocar el claxon, pedalear, parar, girar, cambiar
