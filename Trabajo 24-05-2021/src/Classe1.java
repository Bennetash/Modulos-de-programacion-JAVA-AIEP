public class Classe1 {
    private String nombre;
    private String apellido;
    private int edad;
    private float nota;

        //CONSTRUCTORES
        public Classe1(){

        }
        public Classe1(String nombre, String apellido, int edad){
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }
        public Classe1(String nombre, String apellido, int edad, float nota){
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.nota = nota;
        }

        //metodos accesores Set y Get
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public String getNombre(){
            return nombre;
        }
        public void setApellido(String apellido){
            this.apellido = apellido;
        }
        public String getApellido(){
            return apellido;
        }
        public void setEdad(int edad){
            this.edad = edad;
        }
        public int getEdad(){
            return edad;
        }
        public void setNota(Float nota){
            this.nota = nota;
        }
        public float getNota(){
            return nota;
        }

    //METODOS
    public int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }

    public void mostrarNombre(){
        System.out.println("El nombre es "+nombre);
    }
}
