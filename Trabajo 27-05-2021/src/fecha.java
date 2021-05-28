public class fecha {
    private int dia;
    private int mes;
    private int año;

    public fecha(){
    }
    public fecha(int dia, int mes, int año){
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }
    public fecha(int año){
        for(mes = 1; mes <= 12; mes++){
            System.out.println("\nmes: "+mes);
            System.out.println("Domingo\tLunes\tMartes\tMiercoles\tJueves\tViernes\tSabado");
            int dia = diasMes(año, mes);
            int findia = 0;
            for(int j=1; j<=dia; j++){
                System.out.print(j+"\t");
                findia++;
                if(findia==7){
                    System.out.println();
                    findia=0;
                }
            }
        }
    }
    public void setAño(int año){
        this.año = año;
    }
    public int getAño(){
        return año;
    }
    public static int diasMes(int año, int mes){
        if(mes == 1 || mes == 3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            return 31;
        }else if (mes==2){
            if(esBisiesto(año)){
                return 29;
            }else{
                return 28;
            }
        }else{
            return 30;
        }
    }

    public static boolean esBisiesto(int año){
        if(año % 4 == 0){
            if(año % 100 == 0){
                if(año %400 == 0){
                    return true;
                }else {
                    return false;
                }
            }else {
                return true;
            }
        }else {
            return false;
        }
    }
}
