package Prom;

public class Promos {
    private String nombre;
    private int imagen, cant;
    private String descripcion, fechavencimiento;
    private double precio;

    public Promos(){

    }

    public Promos(String nombre, int imagen, String descripcion, String fechavencimiento, double precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.fechavencimiento = fechavencimiento;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(String fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double calcularPrecio(){
        double price=0;
        switch (nombre.toUpperCase()){
            case "A":
                price=cant*50;
                break;

            case "B":
                price=cant*179;
                break;

            default:
                price=0;
        }
        return price;
    }
    public String PrecioFinal(){
        return "Promo "+ nombre+ "\n"+ "Cantidad " + cant+ "\n" + "Precio a pagar " + calcularPrecio();
    }
}
