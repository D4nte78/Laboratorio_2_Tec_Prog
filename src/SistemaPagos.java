import java.util.ArrayList;

public class SistemaPagos {
    private ArrayList<Estudiante> estudiantes;

    public SistemaPagos() {
        estudiantes = new ArrayList<>();
    }

    public boolean registrarEsrudiante(Estudiante nuevo) {
        for (Estudiante e : estudiantes) {
            if (e.getIdentificacion().equals(nuevo.getIdentificacion())) {
                System.out.println("Error: ID duplicado");
                return false;
            }
        }
        estudiantes.add(nuevo);
        return true;
    }

    public void mostrarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }
}
