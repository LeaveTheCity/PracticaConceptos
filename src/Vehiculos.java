// Vehiculos.java
public class Vehiculos {
    // Clase Vehiculo
    public static class Vehiculo {
        private String marca;
        private String modelo;

        public Vehiculo(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void mostrarInfo() {
            System.out.println("Marca: " + marca + ", Modelo: " + modelo);
        }
    }

    // Clase Coche que hereda de Vehiculo
    public static class Coche extends Vehiculo {
        private int numeroDePuertas;

        public Coche(String marca, String modelo, int numeroDePuertas) {
            super(marca, modelo);
            this.numeroDePuertas = numeroDePuertas;
        }

        public int getNumeroDePuertas() {
            return numeroDePuertas;
        }

        public void setNumeroDePuertas(int numeroDePuertas) {
            this.numeroDePuertas = numeroDePuertas;
        }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Número de puertas: " + numeroDePuertas);
        }
    }

    // Clase Moto que hereda de Vehiculo
    public static class Moto extends Vehiculo {
        private boolean tieneSidecar;

        public Moto(String marca, String modelo, boolean tieneSidecar) {
            super(marca, modelo);
            this.tieneSidecar = tieneSidecar;
        }

        public boolean isTieneSidecar() {
            return tieneSidecar;
        }

        public void setTieneSidecar(boolean tieneSidecar) {
            this.tieneSidecar = tieneSidecar;
        }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
        }
    }
}


