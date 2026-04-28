import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema para registrar estudiantes ");
        System.out.println("");

        SistemaPagos sistema = new SistemaPagos();

        boolean corriendo = true;
        while (corriendo) {

            System.out.println("1. Registrar Estudiante ");
            System.out.println("2. Registrar Pago Estudiante ");
            System.out.println("3. Consultar Estudiante y sus Pagos ");
            System.out.println("4. Mostrar totales recaudados por la Universidad ");
            System.out.println("5. Salir ");
            //Interfaz del usuario del inicio

            int numeroinstruccion = 0;

            try {

                numeroinstruccion = scanner.nextInt();
                scanner.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Por favor ingresa un numero válido ");
            }//Sistema para elegir a que seccion dirigirse




            switch (numeroinstruccion) {
                case 1: {

                    System.out.println("Has entrado en el registro de estudiantes\n");

                    System.out.println("Ingresa el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingresa la identificacion: ");
                    String identificacion = scanner.nextLine();
                    System.out.println("Ingresa el programa: ");
                    String programa = scanner.nextLine();
                    System.out.println("Ingresa el semestre:");
                    int semestre = scanner.nextInt();

                    sistema.registrarEstudiante(identificacion, nombre, programa, semestre);

                    break;// Caso 1, donde se registran los estudiantes
                }


                case 2: {

                    System.out.println("Has entrado al registro de pagos\n");

                    System.out.println("1. Efectivo");
                    System.out.println("2. Tarjeta");
                    System.out.println("3. Transferencia ");
                    System.out.println("4. Cripto ");

                    //Aca se usa esto para elegir un tipo de pago

                    int tipopago = 0;


                    try {

                        tipopago = scanner.nextInt();


                    } catch (InputMismatchException e) {

                        System.out.println("Ingresa un número válido ");

                    }// Comprobacion de que el valor necesario si se es ingresado

                    System.out.println("Ingresa ahora el monto \n");
                    double monto = scanner.nextDouble();
                    scanner.nextLine();


                    Pago pago = null;
                    switch (tipopago) {
                        case 1:
                            pago = new PagoEfectivo(monto);
                            break;
                        case 2:
                            pago = new PagoTarjeta(monto);
                            break;
                        case 3:
                            pago = new PagoTransferencia(monto);
                            break;
                        case 4:
                            pago = new PagoCripto(monto);
                            break;
                    }//Aca se crea el objeto, con el molde de los tipos de clases

                    System.out.println("Ingresa ahora la identificacion del estudiante a registrar el pago ");
                    String identificacion = scanner.nextLine();

                    sistema.registrarPagos(identificacion, pago);

                    //Registro


                    break;
                }// caso 3, donde se registran los pagos, de un estudiante

                case 3:{

                    System.out.println("Has entrado al sistema donde se consultan los pagos de los estudiantes \n ");

                    System.out.println("Ingresa a continuacion la identificacion del estudiante: ");


                    String identificacion = scanner.nextLine();

                    Estudiante encontrado = sistema.buscarEstudiante(identificacion);

                    if (encontrado != null){

                        for (Pago p: encontrado.getPagos()){
                            System.out.println(p.getClass().getSimpleName() + "- $ "+ p.calcularTotal());

                        }
                        System.out.println("Caso 3 terminado");
                    }





                }


                    break;

                case 4: {

                    System.out.println("Has entrado a consultar que ha recaudado la universidad \n ");

                    System.out.println("A continuacion se mostrara todo lo recaudado por la universidad \n");


                    System.out.println("Recaudado por todos los tipos \n");
                    System.out.println("Todo lo recaudado: $"+sistema.totalRecaudado());

                    System.out.println("Total recaudado por medio de Efectivo: $"+sistema.totalPorTipo("PagoEfectivo"));
                    System.out.println("Total recaudado por medio de Tarjeta: $"+sistema.totalPorTipo("PagoTarjeta"));
                    System.out.println("Total recaudado por medio de Transferencia: $"+sistema.totalPorTipo("PagoTransferencia"));
                    System.out.println("Total recaudado por medio de Criptomoneda: $"+sistema.totalPorTipo("PagoCripto"));


                    break;
                }

                case 5:
                    System.out.println("Programa finalizado");

                    corriendo = false;
                    break;


            }

        }


    }
}