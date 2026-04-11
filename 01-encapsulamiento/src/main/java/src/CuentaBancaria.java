package encapsulacion;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("El deposito a sido hecho correctamente");
            System.out.println("Ha depositado: " + valor);
            System.out.println("Posee: " + saldo);
        } else {
            System.out.println("El valor a depositar debe ser mayor a 0");
        }
    }

    public void retirar(double valor){
        if (valor <= 0){
            System.out.println("El retiro debe ser mayor a 0");
        } else if (valor > saldo){
            System.out.println("No posee los fondos para hacer esa transacción");
        } else {
            saldo -= valor;
            System.out.println("Retiro realizado correctamente");
            System.out.println("Ha retirado: " + valor);
        }
    }
}