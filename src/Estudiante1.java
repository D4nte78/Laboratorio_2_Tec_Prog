import java.util.ArrayList;

public class Estudiante extends Persona {

    private String programa;
    private int semestre;
    private ArrayList<Pago> pagos;

    public Estudiante(String nombre, String identificacion, String programa, int semestre) {
        super(nombre, identificacion);
        this.programa = programa;
        this.semestre = semestre;
        pagos = new ArrayList<>();
    }

    public String getPrograma() {
        return programa;
    }

    public int getSemestre() {
        return semestre;
    }

    public void realizarPago(double monto) {
        System.out.println("Pago realizado por: " + monto);
    }
}