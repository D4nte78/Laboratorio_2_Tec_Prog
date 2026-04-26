public class Estudiante implements Pagable {
    private String nombre;
    private String identificacion;
    private String programa;
    private int semestre;
    private double saldo;

    public Estudiante(String nombre, String identificacion, String programa, int semestre) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.programa = programa;
        this.semestre = semestre;
        this.saldo = 0;
    }
    public void realizarpago(double monto) {
        saldo += monto;
        System.out.println("pago realizado: " + monto);
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Estudiante normal paga: " + monto);
    }

}
