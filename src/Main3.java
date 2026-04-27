public class Main3 {
    public static void main(String[] args) {

        Estudiante e = new Estudiante("sofia", "255", "sistemas", 4);
        Pago p = new PagoTarjeta(1000);

        Recibo r = new Recibo(e,p);
        r.imprimirRecibo();
    }
}
