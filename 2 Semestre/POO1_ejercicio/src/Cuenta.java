public class Cuenta {
    private int base;
    private int ingreso;
    private int retiro;

    public Cuenta(int base ){
        this.base = base;

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }

    public void ingreso(int ingreso) {
        this.base = this.base + ingreso;

    }
    public void  retiro(int retiro){
        this.base = this.base - retiro;
    }

    @Override
    public String toString(){
        return "Cantidad final: "+ this.base;
    }
}
