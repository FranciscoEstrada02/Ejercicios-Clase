public class Metodos {
    public static  final String nombres[] = {"Fran", "Romi", "Pepe", "Firulais"};

    public static int generarNumeroAleatorio(int minimo,int maximo){
        int num = (int)Math.floor(Math.random()*(minimo-(maximo+1) + (maximo+1)));
        return num;
    }

    public static double generarNumeroAleatorioDecimal(int minimo, int maximo){
        double num =Math.floor(Math.random()*(minimo-(maximo+1) + (maximo+1)));
        return num;
    }
}
