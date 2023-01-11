import java.util.Random;

public class Punto3d {
    //Atributos

    private int posX;
    private int posY;
    private int posZ;

    private static int contadorPuntos;


    //Constructor

    public Punto3d(int posX, int posY, int posZ){
        this.contadorPuntos++;
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
    }



    public void moverPunto(int posXFinal, int posYFinal, int posZFinal){
        this.posX = posXFinal;
        this.posY = posYFinal;
        this.posZ = posZFinal;
    }

    public void desplazarCentro(){
        this.posX = 0;
        this.posY = 0;
        this.posZ = 0;

    }
    public void moverAPunto(Punto3d punto2){
        this.posX = punto2.posX;
        this.posY = punto2.posY;
        this.posZ = punto2.posZ;


    }

    public void desplazarRandom(int limite){
        Random rnd = new Random();
        this.posX = rnd.nextInt(limite);
        this.posY = rnd.nextInt(limite);
        this.posZ = rnd.nextInt(limite);

    }

    public static int getContadorPuntos() {
        return contadorPuntos;
    }

    public static void setContadorPuntos(int contadorPuntos) {
        Punto3d.contadorPuntos = contadorPuntos;
    }

    @Override

    public String toString(){
        return "El punto se movio al punto: " + posX + " " + posY + " " + posZ;

    }







}
