import java.util.ArrayList;
import java.util.Scanner;

public class Bicicletas {

    private String marca;
    private String color;
    private boolean marchas;
    private int year;
    private double maxVel;
    private boolean electrica;
    private boolean claxon;
    private double precio;
    public ArrayList<Bicicletas> tienda = new ArrayList<>();

    public Bicicletas(String marca, String color, boolean marchas, int year, double maxVel, boolean electrica,
            boolean claxon, double precio) {
        this.marca = marca;
        this.color = color;
        this.marchas = marchas;
        this.year = year;
        this.maxVel = maxVel;
        this.electrica = electrica;
        this.claxon = claxon;
        this.precio = precio;
    }

    public Bicicletas() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMarchas() {
        return marchas;
    }

    public void setMarchas(boolean marchas) {
        this.marchas = marchas;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMaxVel() {
        return maxVel;
    }

    public void setMaxVel(double maxVel) {
        this.maxVel = maxVel;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    public boolean isClaxon() {
        return claxon;
    }

    public void setClaxon(boolean claxon) {
        this.claxon = claxon;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bicicletas marca:" + marca + ", color:" + color + ", marchas:" + marchas + ", year:" + year
                + ", maxVel:" + maxVel + ", electrica:" + electrica + ", claxon:" + claxon + ", precio:" + precio + ".";
    }

    private boolean validarTrue(String pregunta) {
        if (pregunta.equalsIgnoreCase("si")) {
            return true;
        } else
            return false;
    }

    public void añadir(Scanner scan) {
        System.out.println("Vamos a añadir tu nueva bicicleta.");
        System.out.print("Marca: ");
        String marca = scan.nextLine();
        System.out.print("Color: ");
        String color = scan.nextLine();
        System.out.print("¿Tiene marchas? ");
        boolean marchas = validarTrue(scan.nextLine());
        System.out.print("Año: ");
        int year = scan.nextInt();
        System.out.print("Velocidad maxima: ");
        int maxVel = scan.nextInt();
        scan.nextLine();
        System.out.print("¿Es electrica? ");
        boolean electrica = validarTrue(scan.nextLine());
        System.out.print("¿Tiene claxon? ");
        boolean claxon = validarTrue(scan.nextLine());
        System.out.print("Precio: ");
        double precio = scan.nextDouble();
        scan.nextLine();

        tienda.add(new Bicicletas(marca, color, marchas, year, maxVel, electrica, claxon, precio));
    }

    public void mostrarTodasMarcas() {

        for (Bicicletas bicicletas : tienda) {
            System.out.print(bicicletas.getMarca());
            System.out.print(" ");
        }
    }

    public void bicicletaMasCara() {
        double mayorPrecio = 0;
        int index = 0;
        for (int i = 0; i < tienda.size(); i++) {
            if (tienda.get(i).precio > mayorPrecio) {
                mayorPrecio = tienda.get(i).precio;
                index = i;
            }
        }
        System.out.println(tienda.get(index));
    }

    public void eliminarBicicleta(Scanner scan){
        System.out.println("Que marca de bicicleta quieres borrar?");
        String marcaBorrar = scan.nextLine();
        int index = 0;
        int contador = 0;
        for ( int i = 0; i<tienda.size(); i++){
            if (tienda.get(i).marca.equalsIgnoreCase(marcaBorrar)) {
                contador++;
                index = i;
            }
        }

        if (contador==1) {
            tienda.remove(index);
        }else{
            System.out.println("Hay más de una bicicleta de este marca, que color quieres borrar?");
            index = 0;
            contador = 0;
            String colorBorrar = scan.nextLine();
            for ( int i = 0; i<tienda.size(); i++){
                if (tienda.get(i).color.equalsIgnoreCase(colorBorrar)&&tienda.get(i).marca.equalsIgnoreCase(marcaBorrar)) {
                    contador++;
                    index = i;
                }
            }
    
        }
        if (contador==1) {
            tienda.remove(index);
        }else
        System.out.println("No podemos concretar la bicicleta a borrar.");
    }

}

// # 16.2-POO.2

// Instructions

// Tienes una colección de bicicletas y vas registrando los últimos modelos que
// compraste en WallaPop.

// - Debes crear una clase Bicicleta con características como: Marca, Modelo,
// Velocidad Máxima, Si
// tiene marchas o no … (estas características puedes cambiarlas según tu gusto)

// - Puedes añadir métodos: tocar el claxon, pedalear, parar, girar, cambiar
// marchas, …

// - Recordar que debe haber también un método constructor y un toString()

// - Primero probar instanciar una o dos bicicletas sueltas

// - Luego, probar a crear un arraylist de bicicletas

// - Y recorrer ese arraylist para mostrarlo con bucle for y/o for-each

// - También se puede mostrar una sola propiedad (o varias) de las bicicletas.
// Ej: mostrar solo marca y
// velocidad máxima de todas las bicicletas.

// - Tema booleanos, probad a ponerlo como texto. Ej: “sí incluye cambio de
// marchas” (modificar el toString() )
// - Probar métodos set desde el main()
// +EXTRA: crear o cambiar o leer desde el scanner de usuario (con o sin bucle)
