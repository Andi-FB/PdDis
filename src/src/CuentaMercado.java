public abstract class CuentaMercado {

    public String nombre;
    public Integer cantMonedas;

    public abstract Operacion crearOperacion(String linea);
}
