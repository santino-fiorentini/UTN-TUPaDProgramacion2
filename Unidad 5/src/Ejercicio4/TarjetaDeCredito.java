package Ejercicio4;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        cliente.setTarjeta(this);
    }

    public String getNumero() { 
        return numero; 
    }
    public void setNumero(String numero) { 
        this.numero = numero; 
    }

    public String getFechaVencimiento() { 
        return fechaVencimiento; 
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() { 
        return cliente; 
    }
    public Banco getBanco() { 
        return banco; 
    }

    @Override
    public String toString() {
        return numero + "\n" + cliente + "\n" + banco;
    }
}