public class Main {
    public static void main(String[] args) {

        Punto c1 = new Punto(0,0);
        Punto c2 = new Punto(10,0);
        Punto c3 = new Punto(10,10);
        Punto c4 = new Punto(0,10);

        Punto t1 = new Punto(3,6);
        Punto t2 = new Punto(6,0);
        Punto t3 = new Punto(0,0);


        Cuadrado cuadrado = new Cuadrado(c1,c2,c3,c4);
        Triangulo triangulo = new Triangulo(t1,t2,t3);

        System.out.println(cuadrado.toString());
        System.out.println(triangulo.toString());
    }
}
