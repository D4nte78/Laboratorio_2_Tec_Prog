public class PagoCripto extends Pago {

    public PagoCripto(double monto) {
        super(monto);
    }

    @Override
    public double calcularTotal() {
        return monto * 0.95;
    }
}
