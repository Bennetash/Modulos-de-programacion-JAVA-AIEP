import java.util.Scanner;

public class contador {
    private int contador;

    //Constructor por defecto
    public contador(){
    }
    //Constructor 
    public contador(int contador){
        if(contador>=0){
            this.contador = contador;
        }else{
            this.contador = 0;
        }
    }
    public void setContador(int contador){
        this.contador=contador;
    }
    public int getContador(){
        return contador;
    }
    //Incrementa
    public void setIncremento(int contador){
        if(contador>=0){
            this.contador++;
        }else{
            this.contador=0;
        }
    }
    public int getIncremento(){
        return contador;
    }
    //decrese
    public void setDecrese(int contador){
        if(contador>=0){
            this.contador--;
        }else{
            this.contador=0;
        }
    }
    public int getDecrese(){
        return contador;
    }
}