import Clases.CicloFor;
import Clases.CicloMientras;
import Clases.Recursividad;
import Clases.EcuacionSumatoria;

public class Main {
    public static void main(String[] args) {
        System.out.println("RECURSIVIDAD: ");
        Recursividad r = new Recursividad();
        r.contarAtras(10);

       CicloFor cf=new CicloFor(0,100,3);
      cf.forHechizo();

      CicloMientras cm=new CicloMientras(0,100,3,true);
        cm.mientrasHechizo();

        EcuacionSumatoria es=new EcuacionSumatoria();
        es.ecuacionSumatoria();


    }
}