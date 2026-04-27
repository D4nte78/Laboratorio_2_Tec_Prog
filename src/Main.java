public class Main {
    public static void main(String[] args) {

        Imprimible e1 = new Estudiante("Juan", "367", "ingenieria", 3);
        Imprimible e2 = new EstudianteBecado("Luna", "896", "medicina", 2);

        e1.realizarPago(1000);
        e2.realizarPago(1000);
    }
}