import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Organico o1 = new Organico();
        //Inorganico i1 = new Inorganico();
        //Metalico g1 = new Metalico();

        //contructores
        //Classe1 c1 = new Classe1();
        //Classe1 c2 = new Classe1("Renzo", "Valencia", 32);
        //Classe1 c3 = new Classe1("Agustina", "Valencia", 5, 6.8f);
        //System.out.println(c2.nombre);
        //System.out.println(c2.apellido);
        //System.out.println(c3.nombre);
        //System.out.println(c3.apellido);
        //System.out.println(c3.nota);
        
        //Accesorios
        //c1.setNombre("Renzo");
        //System.out.println(c1.getNombre());


        //Celsius a Kelvin
        //o1.Kelvin(67);
        //o1.Temperatura(67);
        //System.out.println("+++++++++++++++++++++++++++++++++");
        
        //definicion microbiologica
        //i1.family1();
        //System.out.println("+++++++++++++++++++++++++++++++++");

        //calculo gas ideal
        //g1.presion();
        //System.out.println("+++++++++++++++++++++++++++++++++");

        //Contador
        contador t0=new contador();
        //Constructor con parametros de inicio para numeros no negativos
        contador t1=new contador(45);
        System.out.println(t1.getContador());
        //incremento
        contador t2=new contador(45);
        System.out.println(t2.getIncremento());
        //decrese
        contador t3=new contador(45);
        System.out.println(t3.getDecrese());
    }
}
