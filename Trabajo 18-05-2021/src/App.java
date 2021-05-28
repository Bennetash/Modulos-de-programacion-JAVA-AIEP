import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);

        float r=0.082f;

        System.out.println("Ingresa la temperatura del reactor ");
        int t=leer.nextInt();

        System.out.println("Ingresa la presion del reactor");
        int p=leer.nextInt();

        System.out.println("Ingresa el volumen del reactor");
        int v=leer.nextInt();

        if(p>=0 && v>=0 && t>=0){

            float n=(p*v)/(r*t);

            while(n>=0 && n<=1){
                System.out.println("El gas presente no cumple con la idealidad debido a que sus moles son "+n);
                n++;
            }
        }else{
            System.out.println("Ingrese nuevamente los valores ");
        }
    }
}
