import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
