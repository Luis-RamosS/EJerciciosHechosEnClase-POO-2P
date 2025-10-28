import Clases.*;

public class Main {
    public static void main(String[] args)
    {
        Persona persona= new Persona("Luis",17,"Baleadas");

        persona.mostrarinfo();

        OperacionesAritmeticas opa = new OperacionesAritmeticas(5,5);
        opa.MostrarResultados();

    }
}
