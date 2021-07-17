public class CuentaMercadoRipple extends  CuentaMercado{


    @Override
    public Operacion crearOperacion(String linea) {
        return new OperacionRipple();
    }
}
