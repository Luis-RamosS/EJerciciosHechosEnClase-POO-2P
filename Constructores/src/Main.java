import Clases.*;

public class Main {
    public static void main(String[] args)
    {
        Persona persona= new Persona("Luis",17,"Baleadas");

        persona.mostrarinfo();

        Operaciones opa = new Operaciones(5,5);
        opa.resultados();

    }
}
