import java.security.Principal;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);

        String numeroc, principal, azimuta, magnetico, espin;

        System.out.println("¿Que Numero cuantico quiere calcular?");
        numeroc=leer.next();

        switch(numeroc){

            case "principal": 

                System.out.println("ingrese un valor");
                int n=leer.nextInt();

                System.out.println("ingrese un orbital");
                char k=leer.next().charAt(0);

                if(k=='S'){

                    int contador=1;
                    while(n>=1 && n<=7 && contador==1){
                        int electrones=n*2;
                        System.out.println("La cantidad de electrones soportada por los orbitales es "+electrones);
                        contador++;
                    }
                }else if(k=='P'){
                    int contador1=1;
                    while(n>=2 && n<=7 && contador1==1){
                        int electronesp=n*6;
                        System.out.println("La cantidad de electrones soportada por los orbitales es "+electronesp);
                        contador1++;
                    }
                }else if(k=='D'){
                    int contador2=1;
                    while(n>=3 && n<=6 && contador2==1){
                        int electronesd=n*10;
                        System.out.println("La cantidad de electrones soportados por los orbitales es "+electronesd);
                        contador2++;
                    }
                }else if(k=='F'){
                    int contador3=1;
                    while(n==4 || n==5 && contador3==1){
                        int electronesf=n*14;
                        System.out.println("La cantidad de electrones soportado por los orbitales es "+electronesf);
                        contador3++;
                    }
                }else{
                    System.out.println("Orbital inexistente");
            }break;

            case "azimuta":

                System.out.println("Ingrese un valor menor a 5");
                int n1=leer.nextInt();

                if(n1<=5){

                    for(n1=0; n1<=5; n1++){

                        int e = n1-1;
                        System.out.println("las orientaciones de los electrones subespacialmente son "+e);

                    }
                } else{
                    System.out.println("Valores fuera del rango");
            }break;
            
            case "magnetico":

                System.out.println("Ingrese un valor de -n a n");
                int n2=leer.nextInt();

                if(n2>=-2 && n2<=2){

                    do{
                        System.out.println(n2);
                        n2++;

                    }while(n2<=2);
                        System.out.println("La proyeccion del momento angular es "+n2);

                }else{
                    System.out.println("Valor ingresado incorrecto");
                }
            break;

            case "espin":

                System.out.println("Ingrese un valor de ");
        } 
    }
}
