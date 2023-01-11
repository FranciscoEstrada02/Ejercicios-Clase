public class Main {
    public static void main(String[] args) {



        Punto3d punto1 = new Punto3d(2,7,5);
        Punto3d punto2 = new Punto3d(3,5,7);

        punto1.moverPunto(2,5,7);
        punto1.moverAPunto(punto2);
        punto1.desplazarRandom(10);



        System.out.println(punto1.toString());

        System.out.println(Punto3d.getContadorPuntos());



    }
}