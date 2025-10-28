package Clases;
import java.util.Scanner;

public class Operaciones {

    int numero1;
    int numero2;

    public Operaciones(int n1,int n2){

        numero1=n1;
        numero2=n2;
    }
    public void resultados(){
        System.out.println("La suma de "+numero1+"+"+numero2+" es: "+(numero1+numero2));
        System.out.println("La resta de "+numero1+"-"+numero2+" es: "+(numero1-numero2));
        System.out.println("La multiplicacion de "+numero1+"x"+numero2+" es: "+(numero1*numero2));
        System.out.println("La division de "+numero1+"/"+numero2+" es: "+(numero1/numero2));

    }
}
