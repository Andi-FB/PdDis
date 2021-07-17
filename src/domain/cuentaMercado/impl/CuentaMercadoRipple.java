package domain.cuentaMercado.impl;

import domain.operacion.Operacion;
import domain.operacion.impl.OperacionRipple;
import domain.cuentaMercado.CuentaMercado;

public class CuentaMercadoRipple extends CuentaMercado {


    @Override
    public Operacion crearOperacion(String linea) {
        return new OperacionRipple();
    }
}
