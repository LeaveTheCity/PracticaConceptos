// Principal.java
public class Main {
    public static void main(String[] args) {
        Vehiculos.Vehiculo miCoche = new Vehiculos.Coche("Toyota", "Corolla", 4);
        Vehiculos.Vehiculo miMoto = new Vehiculos.Moto("Honda", "Shadow", true);

        Persona persona1 = new Persona("Juan", miCoche);
        Persona persona2 = new Persona("Ana", miMoto);

        persona1.mostrarInfo();
        persona2.mostrarInfo();

        // Ejemplo de polimorfismo
        Vehiculos.Vehiculo[] vehiculos = {miCoche, miMoto};
        for (Vehiculos.Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInfo();
        }
    }
}

