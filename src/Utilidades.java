import java.util.ArrayList;

public class Utilidades {

    public static ArrayList<Double> calcularIVALista(ArrayList<Double> pagos) {

        ArrayList<Double> resultados = new ArrayList<>();

        for(double pago : pagos) {
            resultados.add(pago * 0.19);
        }

        return resultados;
    }
}