public class Movil {
    private String marca;
    private boolean encendido;
    private boolean encender;
    private String versionSO;
    private boolean apretaBoton;

    public Movil(String marca, boolean encendido, String versionSO, boolean apretaBoton) {
        this.marca = marca;
        this.encendido = encendido;
        this.versionSO = versionSO;
        this.apretaBoton = apretaBoton;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public String getVersionSO() {
        return versionSO;
    }

    public void setVersionSO(String versionSO) {
        this.versionSO = versionSO;
    }

    //Metodos

    public void encederMovil(){
        if(apretaBoton = true){
            encender = true;
        }else {
            encender = false;
        }

    }

    @Override
    public String toString() {
        return "Movil{" +
                "marca='" + marca + '\'' +
                ", encendido=" + encendido +
                ", versionSO='" + versionSO + '\'' +
                ", apretaBoton=" + apretaBoton +
                ", encendido=" + encender +
                '}';
    }
}


