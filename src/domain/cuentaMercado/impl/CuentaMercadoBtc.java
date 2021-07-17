package domain.cuentaMercado.impl;

import domain.operacion.Operacion;
import domain.operacion.impl.OperacionesBtc;
import domain.cuentaMercado.CuentaMercado;

public class CuentaMercadoBtc extends CuentaMercado {

    @Override
    public Operacion crearOperacion(String linea) {
        return new OperacionesBtc();
    }

}
