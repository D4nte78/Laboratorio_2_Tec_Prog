import java.util.ArrayList;

public class SistemaPagos {

    private ArrayList<Estudiante> estudiantes;


    public SistemaPagos(){

        estudiantes = new ArrayList<>();
    }


    public void registrarEstudiante(String Identificacion ,String Nombre, String programa, int semestre ){

        Estudiante nuevo = new Estudiante(Nombre, Identificacion,programa,semestre);

        for (Estudiante e : estudiantes){
            if (e.getIdentificacion().equals(Identificacion)){

                System.out.println("Esta identificacion ya existe. \n no es posible registrar un estudiante con una Identificacion ya existente. \n Confirma si ya se ha registrado o tal vez la Identificacion esta mal.");
                return;
            }

        }
        estudiantes.add(nuevo);



    }// Permite registarr los datos de estudiantes, y lo guarda en la arraylist que se crea justo cuando se ejecuta la clase
    //SistemaPagos
}
// Clase para revisar si una identificacion se repite --- Esta a medias