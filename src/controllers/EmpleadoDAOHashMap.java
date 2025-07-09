package controllers;
import java.util.HashMap;
import java.util.Map;
import models.Empleado;
import controllers.EmpleadoDAO;

public class EmpleadoDAOHashMap implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();

    }
    

    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
    }

    @Override
    public void list() {
        for (Empleado emp : empleados.values()) {
            System.out.println(emp);
        }
    }

    @Override
    public void remove(int id) {
        Empleado temporal = new Empleado(id);
        empleados.remove(temporal);   
     }
}