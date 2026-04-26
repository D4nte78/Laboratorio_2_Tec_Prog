public class Main2 {
    public static void main(String[] args) {

        Pago p1 = new PagoEfectivo(10000);
        Pago p2 = new PagoTarjeta(10000);
        Pago p3 = new PagoTransferencia(1000);
        Pago p4 = new PagoCripto(100);

        Pago[] pagos = {p1, p2, p3, p4};

        for (Pago p : pagos) {
            System.out.println("total a pagar: " + p.calcularTotal());
        }
    }
}
