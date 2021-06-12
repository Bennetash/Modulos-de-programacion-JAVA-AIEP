import java.nio.channels.OverlappingFileLockException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int personas, presupuesto;
        System.out.println("¿Cuantas personas asistiran al almuerzo?");

        personas = leer.nextInt();

        if(personas>200 && personas <= 300){
            presupuesto = personas*7500;

        }else if(personas>300){
            presupuesto = personas*8500;
        }else{
            presupuesto = personas*9500;
        }
        System.out.println("Su presupuesto para "+personas+" personas, es de "+presupuesto);  
    }
}

public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner leer1 = new Scanner(System.in);
        int valor;
        valor = leer1.nextInt();

        switch(valor){
            case 1: System.out.println("Selecciona la opcion 1");
            break;
            case 2: System.out.println("Selecciona la opcion 2");
            break;
            default: System.out.println("Opcion no valida");
        }
    }
}

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner leer3 = new Scanner(System.in);

        int num_alumnos, pago_alumnos, pago_compañia, opciont;
        System.out.println("Cuantos alumnos asistiran al viaje");
        num_alumnos = leer3.nextInt();
        System.out.println("Opciones");
        System.out.println("1 = mas de 100 alumnos");
        System.out.println("2 = entre 50 y 99 alumnos");
        System.out.println("3 = entre 30 y 49 alumnos");
        System.out.println("otro valor = menos de 30 alumnos");
        System.out.println("Ingrese la opcion que refleja la cantidad de alumnos a participar en el viaje de estuio");
        opciont = leer3.nextInt();
        switch(opciont){
            case 1: 
            pago_alumnos=6500;
            pago_compañia=num_alumnos*6500;
            System.out.println("La cantidad para pagar en total es "+pago_alumnos+" y a la compañia se le debe pagar "+pago_compañia);
            break;
            case 2:
            pago_alumnos=7000;
            pago_compañia=num_alumnos*7000;
            System.out.println("La cantidad para pagar en total es "+pago_alumnos+" y a la compañia se le debe pagar "+pago_compañia);
            break;
            case 3:
            pago_alumnos=9500;
            pago_compañia=num_alumnos*9500;
            System.out.println("La cantidad para pagar en total es "+pago_alumnos+" y a la compañia se le debe pagar "+pago_compañia);
            default:
            System.out.println("El valor por una cantidad asi es de 400.000");
        }
    }
}

public class App3 {
    public static void main(String[] args) throws Exception {
        //While
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("Do while");
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<=10);
        System.out.println("for");
        for(int k=1; k<=10; k++){
            System.out.println(k);
        }
    }
}