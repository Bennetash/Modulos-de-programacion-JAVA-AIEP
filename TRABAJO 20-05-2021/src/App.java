import java.io.BufferedReader;
import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        System.out.println("Introdusca un numero");
        String nu= br.readLine();
        int numero = Integer.parseInt(nu);

        for(int i=1; i<=numero; i++){
            if (numero%i == 0 && i<=numero){
                System.out.println(i);
                
            }
        }

    }
}
