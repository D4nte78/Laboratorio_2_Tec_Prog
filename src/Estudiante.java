import java.util.ArrayList;

public class Estudiante extends Persona  {

    private String programa;
    private int semestre;
    private ArrayList<Pago> pagos;

    //Datos guardados ---

    public Estudiante(String nombre, String identificacion, String programa, int semestre) {

        super(nombre, identificacion);
        this.programa = programa;
        this.semestre = semestre;
        this.pagos = new ArrayList<>();

    }//Relleno de datos --- Se guarda id y nombre en persona, se crea la ArrayList para guardar pagos del estudiante

    public String getPrograma() {
        return this.programa;
    }

    public int getSemestre() {
        return this.semestre;
    }

    public ArrayList<Pago> getPagos(){return pagos;}
    //Obtencion de datos --- Getters para acceder a los atributos privados de la clase
}
