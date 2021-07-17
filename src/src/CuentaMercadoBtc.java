public class CuentaMercadoBtc extends CuentaMercado{

    @Override
    public Operacion crearOperacion(String linea) {
        return new OperacionesBtc();
    }

}
