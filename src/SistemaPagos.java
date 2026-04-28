import java.util.ArrayList;

public class SistemaPagos {

    private ArrayList<Estudiante> estudiantes;


    public SistemaPagos() {

        estudiantes = new ArrayList<>();
    }


    public void registrarEstudiante(String Identificacion, String Nombre, String programa, int semestre) {

        Estudiante nuevo = new Estudiante(Nombre, Identificacion, programa, semestre);

        for (Estudiante e : estudiantes) {
            if (e.getIdentificacion().equals(Identificacion)) {

                System.out.println("Esta identificacion ya existe. \n no es posible registrar un estudiante con una Identificacion ya existente. \n Confirma si ya se ha registrado o tal vez la Identificacion esta mal.");
                return;
            }

        }
        estudiantes.add(nuevo);


    }// Permite registrar los datos de estudiantes, y lo guarda en la arraylist que se crea justo cuando se ejecuta la clase

    //SistemaPagos
    public void registrarPagos(String Identificacion, Pago pago) {

        for (Estudiante e : estudiantes) {

            if (e.getIdentificacion().equals(Identificacion)) {
                System.out.println("El estudiante si se encuentra registrado! ");
                System.out.println("Guardando pago para el estudiante");
                e.agregarPago(pago);
                return;
            }

        }
        System.out.println("Este id no esta registrado en el sistema. \n Revisa si esta bien digitado, o por el contrario si necesitas registrar el estudiante primero. ");

    }
    public Estudiante buscarEstudiante(String identificacion){
        for(Estudiante e: estudiantes) {

            if (e.getIdentificacion().equals(identificacion)) {
                return e;
            }

        }
        System.out.println("no se encuentra tal estudiante registrado");
        return null;

    }

    public double totalRecaudado() {

        double totalrecaudado;
        totalrecaudado = 0;

        for (Estudiante e : estudiantes) {
            for (Pago p : e.getPagos()) {

                totalrecaudado += p.calcularTotal();


            }
        }

        return totalrecaudado;
    }

    public double totalPorTipo(String tipo) {

        double totalrecaudadotipo;
        totalrecaudadotipo = 0;

        for (Estudiante e : estudiantes){

            for (Pago p : e.getPagos()){

                if(p.getClass().getSimpleName().equals(tipo)){

                    System.out.println("Sumando todo lo recaudado por el tipo de pago "+ tipo);

                    totalrecaudadotipo += p.calcularTotal();
                }

            }

        }
        return totalrecaudadotipo;







    }


}
// Clase para revisar si una identificacion se repite ---