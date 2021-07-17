package domain.cuentaMercado.impl;

import domain.operacion.Operacion;
import domain.operacion.impl.OperacionEth;
import domain.cuentaMercado.CuentaMercado;

public class CuentaMercadoEth extends CuentaMercado {


    @Override
    public Operacion crearOperacion(String linea) {
        return new OperacionEth();
    }
}
