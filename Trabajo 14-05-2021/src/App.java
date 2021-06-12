import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num;
        int multiplo;
        int suma;
        int i;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero limite: ");
        num = leer.nextInt();
        System.out.println("Ingrese numero : ");
        multiplo = leer.nextInt();
        suma=0;
        i=0;
        do{
            suma = suma + (multiplo*i);
            i=i+1;
        }while (i<=num);

        System.out.println("el resultado es "+suma);
        i=0;
        suma = 0;

        while(i <= num){
            suma = suma + (multiplo*i);
            i=i+1;
        }

        System.out.println("el resultado es "+suma);
        suma = 0;

        for(i=0;i<=num;i=i++){
            suma = suma + (multiplo*1);
        }

        System.out.println("el resultado es "+suma);
    }
}

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner leer2 = new Scanner(System.in);

        System.out.println("");
        System.out.println("Numeros del 0 al 50 de 10 en 10");
        for(int g=0;g<=50;g++){
            g=g+9;
        }
        int num, suma=0, mod, sumamod=0;

        System.out.println("Numeros Multiplos");
        num=leer2.nextInt();
        for(int k=0;k<=100;k++){

            if(k%num==0){
                sumamod=sumamod+k;
                System.out.println(k);
            }
        }
        System.out.println("el resultado de la suma es"+suma);
    }
}

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner leer3 = new Scanner(System.in);

        int n=100;
        int x=9;
        int i;
        int suma1=0;

        for(i=1; i<=n; i++){
            if (i%x == 0){
                suma1=suma1+i;
                System.out.println(i);
            }
            System.err.println("la suma de los multiplos es "+suma1);
        }
    }
}

public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner leer4 = new Scanner(System.in);
        
        System.out.println("Cuantos numeros desea ingresar");
        int num = leer4.nextInt();
        System.out.println("Los multiplos de los numeros seleccioneados son");
        int multiplo1 = leer4.nextInt();
        System.out.println("Ingresa tus numeros");

        for(int l=0;l<=num;l++){
            int ingresados = leer4.nextInt();

            if(ingresados%multiplo1==0){
               int sumah=(sumah+1);
            }
        }
        System.out.println("los "+num+"numeros ingresados, un total de "+sumah+"son multiplos de "+multiplo1);
    }
}

public class App5 {
    public static void main(String[] args) throws Exception {
        Scanner leer6 = new Scanner(System.in);

        int numeror = 0;
        numeror = leer6.nextInt();
        List lista = new ArrayList<>();

        System.out.println("Introduce numeros. el 0 es para salir");

        do{
            numeror = leer6.nextInt();
            lista.add(numeror);
        }while (numeror!=0);
    }
}