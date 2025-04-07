public class Paciente {

    //Atributos
    String nombre;
    int edad;
    String noexp;

    //Metodos
    //Primero es el Tipo de regreso después el Nombre y al final los Parámetros (con su tipo)
    public void mostrarInformacion () {
        //Muestra el nombre del paciente
        System.out.println("Paciente:" + nombre);
        //Muestra la edad del paciente
        System.out.println("Edad:" + edad);
        //Muestra el expediente del paciente
        System.out.println("Expediente:" + noexp);
    }
}