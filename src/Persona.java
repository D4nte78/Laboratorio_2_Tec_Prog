public class Persona {

    private String nombre;
    private String identificacion;

    //Datos encapsulados guardados ----


    public Persona(String nombre, String identificacion){

        this.nombre = nombre;
        this.identificacion = identificacion;
    }//Constructor para recibir los datos al crear el objeto. Se ejecuta al crear el objeto

    public String getNombre() {return nombre; }
    public String getIdentificacion() {return identificacion;}
    //Getters para poder llamarlos en otras clases
}
//nombre identificacion // No abstracta