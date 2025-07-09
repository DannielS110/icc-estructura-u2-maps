import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=====================================");

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Daniel Sanchez"); /// Cambiar por su nombre
        runMapExamlpe();

        runEmpleadoExample();

        runEjerccios();
        System.out.println("=====================================");

    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        System.out.println("----HashMap----");
        mapa.runHashMap();
        System.out.println("----LinkedHashMap----");
        mapa.runLinkedHashMap();
        System.out.println("----TreeMap----");
        mapa.runTreeMap();
        System.out.println("----HashMap con Objetos----");
        mapa.runHasMapObj();
        
    }

    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
    
}
