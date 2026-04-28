import java.util.ArrayList;

public class Pagos {

    private ArrayList<Pago> pagos;

    public Pagos() {
        pagos =new ArrayList<>();
    }

    public void agregarPago(Pago pago) {
        pagos.add(pago);
    }

    public String mostrarPagos() {

        String texto = "";

        for (Pago p : pagos) {
            texto += p.getClass().getSimpleName() + "- $" + p.calcularTotal() + "\n";
        }

        return texto;
    }

    public double totalRecaudado() {

        double total = 0;

        for (Pago p : pagos) {
            total += p.calcularTotal();
        }

        return total;
    }

    public int totalPorTipo(String tipo) {

        int contador = 0;

        for (Pago p : pagos) {
            if (p.getClass().getSimpleName().equals(tipo)){
                contador++;
            }
        }

        return contador;
    }

}