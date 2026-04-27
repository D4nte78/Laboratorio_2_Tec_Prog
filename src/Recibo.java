import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Recibo implements Imprimible {

    private Estudiante estudiante;
    private Pago pago;

    public Recibo(Estudiante estudiante, Pago pago) {
        this.estudiante = estudiante;
        this.pago = pago;

    }

    @Override
    public void imprimir() {

        NumberFormat formato = NumberFormat.getCurrencyInstance();
        DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("--------RECIBO DE PAGO--------");
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("ID: " + estudiante.getIdentificacion());
        System.out.println("programa: " + estudiante.getPrograma());

        System.out.println("Tipo de pago: " + pago.getClass().getSimpleName());
        System.out.println("Monto base: " + formato.format(pago.monto));
        System.out.println("total pagado: " + formato.format(pago.calcularTotal()));

        System.out.println("Fecha: " + LocalDate.now().format(fechaFormato));
        System.out.println("------------------------------");
    }// Con polimorfismo, logramos usar la interfaz imprimible, y le indicamos lo que queremos imprimir, usamos una libreria para
    // Lograr mostrar el tiempo actual
}

