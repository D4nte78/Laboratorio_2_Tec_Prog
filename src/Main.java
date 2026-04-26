public class Main {
    public static void main(String[] args) {
        SistemaPagos sistema = new SistemaPagos();

        Estudiante e1 = new Estudiante("juan", "367", "ingenieria",3);
        Estudiante e2 = new Estudiante("luna", "896", "medicina", 2);

        sistema.registrarEsrudiante(e1);
        sistema.registrarEsrudiante(e2);

        sistema.mostrarEstudiantes();
    }
}