public class main {
    public static void main(String[] args) {
        SistemaPagos sitema = new SistemaPagos();

        Estudiante e1 = new Estudiante("Juan", "123", "ingenieria", 3);
        Estudiante e2 = new Estudiante("Ana", "134", "medicina", 2);

        sitema.registrarEsrudiante(e1);
        sitema.registrarEsrudiante(e2);

        sitema.registrarEsrudiante();

    }
}