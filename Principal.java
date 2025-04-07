public class Principal {
    public static void main (String[] args){
        //Crear un objeto nuevo de tipo paciente
        //Primerola clase, después el identificador y despues "new"+constructor
        Paciente paciente1 = new Paciente();

        //asignar valores
        paciente1.nombre="Lena Marie";
        paciente1.edad=25;
        paciente1.noexp="EXP202409";

        //llamas al metodo de mostrarInformación para el paciente 1
        paciente1.mostrarInformacion();

    }
}
