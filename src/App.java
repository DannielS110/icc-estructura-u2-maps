import controllers.Ejercicios;
import controllers.Mapa;
import models.Empleado;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOTreeMap;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoController;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=====================================");

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Daniel Sanchez"); /// Cambiar por su nombre
        //runMapExamlpe();

       runEmpleadoExample();

        //runEjerccios();
        System.out.println("=====================================");

    }

    /*private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        System.out.println("----HashMap----");
        mapa.runHashMap();
        System.out.println("----LinkedHashMap----");
        mapa.runLinkedHashMap();
        System.out.println("----TreeMap----");
        mapa.runTreeMap();
        System.out.println("----HashMap con Objetos----");
        mapa.runHasMapObj();
        System.out.println("----TreeMap con Objetos----");
        mapa.runTreeMapObj();
        
    }*/

    private static void runEmpleadoExample() {
    EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTreeMap();
    EmpleadoController empleadoControllerTree = new EmpleadoController(empleadoDAOTree);

    EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
    EmpleadoController empleadoControllerHash = new EmpleadoController(empleadoDAOHash);

    Empleado emp1 = new Empleado(4, "Pedro", "DEV");
    Empleado emp2 = new Empleado(2, "Pedro", "DEV");
    Empleado emp3 = new Empleado(5, "Juan", "DEV");
    Empleado emp4 = new Empleado(3, "Maria", "DEV");
    Empleado emp5 = new Empleado(1, "Juan", "DEV");

    empleadoControllerHash.agregarEmpleado(emp1);
    empleadoControllerHash.agregarEmpleado(emp2);
    empleadoControllerHash.agregarEmpleado(emp3);
    empleadoControllerHash.agregarEmpleado(emp4);
    empleadoControllerHash.agregarEmpleado(emp5);

    empleadoControllerTree.agregarEmpleado(emp1);
    empleadoControllerTree.agregarEmpleado(emp2);
    empleadoControllerTree.agregarEmpleado(emp3);
    empleadoControllerTree.agregarEmpleado(emp4);
    empleadoControllerTree.agregarEmpleado(emp5);     
    
    empleadoControllerHash.list();
    empleadoControllerHash.remove(2);
    empleadoControllerHash.list();

    empleadoControllerTree.list();
    empleadoControllerTree.remove(2);
    empleadoControllerTree.list();
    }

    /*private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }*/

    
}
