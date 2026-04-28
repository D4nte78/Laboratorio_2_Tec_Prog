public class Utilidades{

    public static final double IVA = 0.19;

    public static double calcularIVA(double monto) {
        return monto * IVA;
    }

    public static double calcularTotalConIVA(double monto) {
        return monto + calcularIVA(monto);
    }

    public static double convertirADolares(double pesos, double tasaCambio) {
        return pesos / tasaCambio;
    }

    public static double convertirAPesos(double dolares, double tasaCambio) {
        return dolares * tasaCambio;
    }
}