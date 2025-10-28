package Clases;

public class CicloMientras {
    int inicio;
    int fin;
    int incremento;

    boolean continuar=true;

    public CicloMientras(int in, int fi, int inc,boolean cn) {
        inicio = in;
        fin = fi;
        incremento = inc;
        continuar=cn;

    }
    public void mientrasHechizo()
    {
        if(fin<=inicio)
        {
            System.out.println("Cliclo mientras Finalizado");
            continuar=false;
            return;
        }
        System.out.println(inicio);
        inicio=inicio+incremento;
    }

}
