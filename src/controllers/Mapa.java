package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {

    public Mapa() {
        System.out.println(" Mapa Class");
    }

    public void runHashMap() {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "Pc");
        System.out.println(mapa);
        System.out.println(mapa.keySet());
        System.out.println(mapa.values());
        for (String key : mapa.keySet()) {
            System.out.println(mapa.get(key));
        }

        System.out.println(mapa.get("001")); 
        System.out.println(mapa.get("005")); 
    }

    public void runLinkedHashMap() {
        Map<Integer, String> linkedMap = new java.util.LinkedHashMap<>();
        linkedMap.put(1, "Juan");
        linkedMap.put(2, "Maria");
        linkedMap.put(3, "Pedro");
        linkedMap.put(4, "Ana");
        linkedMap.put(5, "Luis");

        System.out.println("LinkedHashMap: " + linkedMap);
        System.out.println("Claves: " + linkedMap.keySet());
        System.out.println("Valores: " + linkedMap.values());

        for (Integer key : linkedMap.keySet()) {
            System.out.println("Valor: " + linkedMap.get(key));
        }
    }

    public void runTreeMap() {
        Map<Integer, String> items = new TreeMap<>();
        items.put(3, "carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");

    System.out.println(items);
    }

   public void runHasMapObj(){
    Map<Empleado, Integer> empleados = new HashMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "Dev"), 3000);
    
    System.out.println("Empleados: " + empleados);

}
public void runTreeMapObj() {
        Map<Empleado, Integer> empleados = new TreeMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);
        System.out.println(empleados);
    }

}