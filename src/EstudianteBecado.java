public class EstudianteBecado extends Estudiante {

    public EstudianteBecado(String nombre, String id, String programa, int semestre) {
        super(nombre, id, programa, semestre);
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Estudiante becado paga menos ");
        super.realizarPago(monto * 0.5);
    }
}
