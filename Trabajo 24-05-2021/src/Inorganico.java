import java.util.Scanner;

public class Inorganico {
    String family1;
    Scanner sr = new Scanner(System.in);
    
    public String family1(){
        System.out.println("··Ingrese familia microbiologica··");
        family1=sr.nextLine();
        
        if(family1.equals("Cianobacteria")){           
            System.out.println("Son organismos microscópicos procariotas con células muy simples que realizan fotosíntesis y contribuyen muy positivamente a generar oxígeno, reciclar nutrientes y captar carbono y nitrógeno atmosférico al agua");
        }else if(family1.equals("Diatomea")){
            System.out.println("Las diatomeas, es un grupo de algas unicelulares que constituye uno de los tipos más comunes de fitoplancton. Contiene actualmente unas 20 000 especies vivas que son importantes productores dentro de la cadena alimenticia.​");
        }else if(family1.equals("Microalga")){
            System.out.println("Las microalgas son microorganismos microscópicos (2-200 μm) fotosintéticos, también son polifiléticos y eucariotas");
        }else{
            System.out.println("parametro sin datos");
        }return family1;
    }
}
