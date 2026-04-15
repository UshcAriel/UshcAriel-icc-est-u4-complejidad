import java.util.List;

public class App {
    public static void main(String[] args) {

        int cantidadEstudiantes = 100_000; // Reducido

        System.out.println("Generando estudiantes...");
        List<Estudiante> estudiantes = Generador.generarEstudiantes(cantidadEstudiantes);

        String cedulaBuscar = "51999"; // Ajusta a un valor existente

        boolean encontrado = busquedaBinaria(estudiantes, cedulaBuscar);

        if (encontrado) {
            System.out.println("EXISTE");
        } else {
            System.out.println("NO EXISTE");
        }
    }

    public static boolean busquedaBinaria(List<Estudiante> estudiantes, String cedulaBuscar) {
        int inicio = 0;
        int fin = estudiantes.size() - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            Estudiante actual = estudiantes.get(medio);

            int comparacion = Integer.parseInt(actual.cedula) - Integer.parseInt(cedulaBuscar);

            if (comparacion == 0) {
                return true;
            } else if (comparacion < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return false;
    }
}
