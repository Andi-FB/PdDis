public abstract class Operacion {

    public Integer cantidad;
    public String credencial;


    public abstract void ejecutar();

    public abstract void mostrar();

    public abstract void reintentar();

    public abstract void revertir();

}
