public class Triangulo {
    private Punto t1;
    private Punto t2;
    private Punto t3;

    private int x1;
    private int y1;
    private double distancia12;

    private int x2;
    private int y2;
    private double distancia23;

    private int x3;
    private int y3;
    private double distancia13;

    public Triangulo(Punto t1, Punto t2, Punto t3){

        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;

    }

    public boolean comprobarTriangulo(){

        x1 = t2.getPosX() - t1.getPosX();
        y1 = t2.getPosY() - t1.getPosY();
        distancia12 = Math.sqrt(x1*x1 + y1*y1);

        x2 = t3.getPosX() - t2.getPosX();
        y2 = t3.getPosY() - t2.getPosY();
        distancia23 = Math.sqrt((x2*x2) + (y2*y2));

        x3 = t3.getPosX() - t1.getPosX();
        y3 = t3.getPosY() - t1.getPosY();
        distancia13 = Math.sqrt(x3*x3 + y3*y3);

        if((distancia12 == distancia23 && distancia13 == distancia23)){
            return true;
        }else{
            return false;
        }
    }

    @Override

    public String toString(){
        if(comprobarTriangulo() == true){
            return "Si es un triangulo";
        }else{
            return "No es un triangulo";
        }
    }
}
