import java.util.Scanner;

public class Metalico {
    int P, V, N, R, T;
    Scanner sr = new Scanner(System.in);

    public int presion(){
        float R = 0.082f;

        System.out.println("··Ingrese Parametros de Calculo, si no tiene datos favor ingresar valor 0");
        System.out.println("··Ingrese Presion");
        int presion = sr.nextInt();
        System.out.println("··Ingrese Volumen");
        int volumen = sr.nextInt();
        System.out.println("··Ingrese moles");
        float moles = sr.nextFloat();
        System.out.println("··Ingrese Temperatura");
        float temperatura = sr.nextFloat();

        if(presion>0 && volumen>0 && moles>0 && temperatura >0 || temperatura<0){
            int calculo1 = presion*volumen;
            float calculo2 = moles*R*temperatura;
            System.out.println("P*V= "+calculo1+", Mientras que N*R*T= "+calculo2);
        }else if(presion==0 && volumen>0 && moles>0 && temperatura >0 || temperatura<0){
            float calculoP = (moles*R*temperatura)/volumen;
            System.out.println("La presion es "+calculoP);
        }else if(presion>0 && volumen==0 && moles>0 && temperatura >0 || temperatura<0){
            float calculoV = (moles*R*temperatura)/presion;
            System.out.println("El volumen es "+calculoV);
        }else if(presion>0 && volumen>0 && moles==0 && temperatura >0 || temperatura<0){
            float calculoM = (presion*volumen)/(R*temperatura);
            System.out.println("Los moles son "+calculoM);
        }else{
            System.out.println("valores fuera de calculo");
        }return presion;
    }
}
