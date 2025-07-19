package dwf.semana2.AA222744;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MiServicio {

    private final List<String> datos = new ArrayList<>();

    public MiServicio() {
        //Datos iniciales
        datos.add("Elemento 1");
        datos.add("Elemento 2");
    }

    public List<String> obtenerDatos() {
        return datos;
    }

    public void agregarDato(String nuevoDato) {
        datos.add(nuevoDato);
    }

}
