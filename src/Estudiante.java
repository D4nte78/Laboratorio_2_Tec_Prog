public class Estudiante {
    private String nombre;
    private String identificacion;
    private String programa;
    private int semestre;

    public Estudiante(String nombre, String identificacion, String programa, int semestre) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.programa = programa;
        this.semestre = semestre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String toString() {
        return "Nombre: " + nombre +
                ", ID:  " + identificacion +
                ", programa: " + programa +
                ", semestre: " + semestre;
    }
}
