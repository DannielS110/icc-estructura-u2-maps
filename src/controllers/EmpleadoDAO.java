package controllers;


public interface EmpleadoDAO {
    void add(models.Empleado empleado);
    void list();
    void remove(int id);
}
