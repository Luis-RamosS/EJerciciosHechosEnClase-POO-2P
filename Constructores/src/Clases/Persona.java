package Clases;

public class Persona {
    String nombre;
    int edad;
    String comida;

    public Persona(String n, int e, String c)
    {
        nombre=n;
        edad=e;
        comida=c;
    }

    //Metodo para mostrar la informacion

    public void mostrarinfo()
    {
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad+" años");
        alimentacion();
    }
    public void alimentacion()
    {
        System.out.println("Le gusta comer: "+comida+".");
    }

}
