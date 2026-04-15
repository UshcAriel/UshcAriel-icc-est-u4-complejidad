import java.util.ArrayList;
import java.util.List;

public class Generador {

    public static List<Estudiante> generarEstudiantes(int cantidadEstudiantes) {
        List<Estudiante> estudiantes = new ArrayList<>();

        for (int i = 0; i < cantidadEstudiantes; i++) {
            String cedula = String.valueOf(i);
            String nombre = "Estudiante_" + i;

            estudiantes.add(new Estudiante(nombre, cedula));
        }

        return estudiantes;
    }
}