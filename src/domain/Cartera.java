package domain;

import domain.cuentaMercado.CuentaMercado;
import domain.operacion.Operacion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Cartera {

    public List<Operacion> operaciones;

    public Cartera(){
        this.operaciones = new ArrayList<>();
    }

    public void procesarOperacion(CuentaMercado cuentaMercado, File archivo){
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea = reader.readLine()) != null){

                Operacion op = cuentaMercado.crearOperacion(linea);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
