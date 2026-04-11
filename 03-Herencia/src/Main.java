package herencia;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Maria", 4500000, "Tecnologia");
        Desarrollar dev = new Desarrollar("Carlos", 3800000, "Java");

        gerente.mostrarInfo();
        gerente.mostrarArea();

        System.out.println("------");

        dev.mostrarInfo();
        dev.mostrarLenguaje();
    }
}