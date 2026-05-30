package Ejercicio10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, int codigo, String ultimaModificacion, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;

        this.clave = new ClaveSeguridad(
                        codigo,
                        ultimaModificacion
                );

        this.titular = titular;
        titular.setCuenta(this);
    }

    public String getCbu() { 
        return cbu; 
    }
    public void setCbu(String cbu) { 
        this.cbu = cbu; 
    }

    public double getSaldo() { 
        return saldo; 
    }
    public void setSaldo(double saldo) { 
        this.saldo = saldo; 
    }

    public ClaveSeguridad getClave() { 
        return clave; 
    }

    public Titular getTitular() { 
        return titular; 
    }

    @Override
    public String toString() {
        return "Cuenta bancaria: " + cbu + " | $" + saldo + "\n" + clave + "\n" + titular;
    }
}