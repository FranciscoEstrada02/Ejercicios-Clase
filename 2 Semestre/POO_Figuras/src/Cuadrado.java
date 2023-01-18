public class Cuadrado {

    private Punto c1;
    private Punto c2;
    private Punto c3;
    private Punto c4;

    private int x1;
    private int y1;
    private double distancia1;
    private int x2;
    private int y2;
    private double distancia2;
    private int x3;
    private int y3;
    private double distancia3;
    private int x4;
    private int y4;
    private double distancia4;
    private java.lang.Object Math;


    public Cuadrado(Punto c1,Punto c2, Punto c3, Punto c4){

       this.c1 = c1;
       this.c2 = c2;
       this.c3 = c3;
       this.c4 = c4;

    }

    public boolean comprobarCuadrado(){
        x1 = c2.getPosX() - c1.getPosX();
        y1 = c2.getPosY() - c1.getPosY();
        distancia1 = Math.sqrt(x1*x1 + y1*y1);

        x2 = c3.getPosX() - c2.getPosX();
        y2 = c3.getPosY() - c2.getPosY();
        distancia2 = Math.sqrt(x2*x2 + y2*y2);

        x3 = c4.getPosX() - c3.getPosX();
        y3 = c4.getPosY() - c3.getPosY();
        distancia3 = Math.sqrt(x3*x3 + y3*y3);

        x4 = c1.getPosX() - c4.getPosX();
        y4 = c1.getPosY() - c4.getPosY();
        distancia4 = Math.sqrt(x4*x4 + y4*y4);

        if((distancia1 == distancia2) && (distancia2 == distancia3) && (distancia3 == distancia4) && (distancia4 == distancia1)){
            return true;
        }else{
            return false;
        }
    }

    @Override

    public String toString(){
        if(comprobarCuadrado() == true){
            return "Si es un cuadrado";
        }else{
            return "No es un cuadrado";
        }
    }
}
