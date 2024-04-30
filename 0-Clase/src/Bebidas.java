public class Bebidas {

    private String nombre;
    private int centilitros;
    private boolean tieneGas;
    private double precio;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCentilitros() {
        return centilitros;
    }
    public void setCentilitros(int centilitros) {
        this.centilitros = centilitros;
    }

    //este es el boolean para validaar si tiene true/false
    public boolean isTieneGas() {
        return tieneGas;
    }
    public void setTieneGas(boolean tieneGas) {
        this.tieneGas = tieneGas;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Bebidas(){
        //Esto genera un constructor vacío para usarlo en el main y luego asignar los valores
    }

    

}
