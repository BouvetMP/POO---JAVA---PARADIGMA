package herencia;

public class Desarrollar extends Empleado{
    private String lenguaje;

    public Desarrollar(String nombre, double salario, String lenguaje){
        super(nombre, salario);
        this.lenguaje = lenguaje;
    }

    public void mostrarLenguaje(){
        System.out.println("Lenguaje principal: " + lenguaje);
    }
    
}
