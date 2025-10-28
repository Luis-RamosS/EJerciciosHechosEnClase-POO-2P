package Clases;

public class CicloFor {
    int inicio;
    int fin;
    int incremento;

    public CicloFor(int in, int fi,int inc)
    {
        inicio=in;
        fin=fi;
        incremento=inc;

    }

    public void forHechizo()
    {
        if(fin<=inicio)
        {
            System.out.println("¡Ciclo Finalizado!");
            return;
        }
        System.out.println(inicio);
        inicio=inicio+incremento;
        forHechizo();
    }


}
