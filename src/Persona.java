// Persona.java
public class Persona {
    private String nombre;
    private Vehiculos.Vehiculo vehiculo;

    public Persona(String nombre, Vehiculos.Vehiculo vehiculo) {
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculos.Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculos.Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        vehiculo.mostrarInfo();
    }
}

