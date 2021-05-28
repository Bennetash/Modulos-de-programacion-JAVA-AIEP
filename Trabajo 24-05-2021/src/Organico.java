public class Organico {
    String nombre;
    int Celsius, Kelvin;
    public int Kelvin(int Celsius){
        System.out.println("La temperatura en Celsius es "+Celsius);
        Kelvin = Celsius + 273;
        System.out.println("La temperatura en Kelvin es "+Kelvin);
        return Kelvin;
    }

    public void Temperatura(int Kelvin){
        if(Kelvin<=0){
            System.out.println("La temperatura "+Kelvin+"alcanzo el 0 absoluto");
        }else{
            System.out.println("La temperatura esta en niveles mecanicos");
        }
    }
}
