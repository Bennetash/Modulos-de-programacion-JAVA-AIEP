import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner numero = new Scanner(System.in);
        int n=0;

        while(n<=100){

            System.out.println("Ingrese Valores para Operacion");
            int n1=numero.nextInt();
            int n2= n1+(n1-2);
            System.out.println(n2);
        }
    }
}
