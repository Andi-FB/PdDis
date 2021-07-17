public class CuentaMercadoEth extends CuentaMercado{


    @Override
    public Operacion crearOperacion(String linea) {
        return new OperacionEth();
    }
}
