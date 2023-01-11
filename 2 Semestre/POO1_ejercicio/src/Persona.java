public class Persona {

    private String nombre;
    private int edad;
    private String cadena;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mayorEdad(int edad){

        if(edad < 18){
            cadena = " Es menor";
        }else{
            cadena = " Es mayor";
        }
    }

    @Override
    public String toString() {
        return "El cliente " + nombre  + cadena;
    }
}
