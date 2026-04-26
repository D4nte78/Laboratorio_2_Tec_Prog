public class PagoTransferencia extends Pago {

    public PagoTransferencia(double monto) {
        super(monto);
    }

    @Override
    public double calcularTotal() {
        return monto * 1.02;
    }
}
