public class PagoTarjeta extends Pago {

    public PagoTarjeta(double monto) {
        super(monto);
    }

    @Override
    public double calcularTotal(){
        return monto * 1.05;
    }
}
