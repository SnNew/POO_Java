package org.example;

public class CuentaBancaria {

    private String titular;
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, double saldo, String numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void depositar(Double monto){
        if(monto > 0){
            saldo += monto;
            System.out.println("Se ha depositado: "+ monto + "pesos exitosamente.");
        }else{
            System.out.println("Ingrese un monto valido para depositar");
        }
    }

    public void retirar(Double monto){
        if (monto > 0 && monto <= saldo){
            saldo -= monto;
            System.out.println("Se ha realizado un retiro de " + monto + "pesos exitosamente.");
        }else {
            System.out.println("Fondos insuficientes en la cuenta");
        }
   }

   public void monstrarInfomacion(){
        System.out.println("INFORMACION DE LA CUENTA");
        System.out.println("Titular: " + titular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: " + saldo);
   }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }

}
