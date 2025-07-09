🗺️ Práctica de Mapas en Java
-------------------------------------------------------------------------
Descripción

Este proyecto demuestra el uso de diferentes tipos de mapas en Java, específicamente HashMap, LinkedHashMap y TreeMap, mostrando sus características y diferencias en el manejo de datos.

Autor

Daniel Sanchez

Profesor 

ING. Pablo Torres

Estructura del Proyecto
----------------------------------------------------------------------------
Implementaciones de Mapas

1. HashMap


Descripción: Implementación básica de mapa que no mantiene orden

Características:


No garantiza orden de inserción

Permite valores null

Acceso rápido O(1) promedio



Datos de ejemplo:

{001=Celular, 002=Laptop, 003=PC}

Salida: [Celular, Laptop, PC]

2. LinkedHashMap


Descripción: Mantiene el orden de inserción de los elementos

Características:


Preserva el orden de inserción

Ligeramente más lento que HashMap

Útil cuando el orden importa




Datos de ejemplo:

{1=Juan, 2=Maria, 3=Pedro, 4=Ana, 5=Luis}

Claves: [1, 2, 3, 4, 5]

Valores: [Juan, Maria, Pedro, Ana, Luis]

Iteración de valores:


Juan

Maria

Pedro

Ana

Luis

3. TreeMap

Descripción: Mantiene los elementos ordenados por clave

Características:

Ordenamiento automático por clave

Implementa NavigableMap

Acceso O(log n)



Datos de ejemplo:

{1=moto, 3=carro, 6=bicicleta}

Manejo de Objetos Complejos

HashMap con Objetos Empleado

El proyecto incluye un ejemplo de HashMap que almacena objetos Empleado con las siguientes propiedades:

ID: Identificador único

Name: Nombre del empleado

Position: Posición/cargo

Dev: Valor de desarrollo (salario/evaluación)

Ejemplo de datos:

javaEmpleados: {
    ID: 1, Name: Diego, Position: Dev=1200,

    ID: 2, Name: Juan, Position: Dev=1500,
    
    ID: 3, Name: Pedro, Position: Dev=2000,
    
    ID: 1, Name: Juan, Position: Dev=3000
}

TreeMap con Objetos Empleado


Implementación similar usando TreeMap para mantener ordenamiento automático:

java{

    ID: 1, Name: Diego, Position: Dev=1200,
    
    ID: 1, Name: Juan, Position: Dev=3000,
    
    ID: 2, Name: Juan, Position: Dev=1500,
    
    ID: 3, Name: Pedro, Position: Dev=2000

}

-------------------------------------------------------------------------

## 🚀 Ejecución
 version 1

![image](https://github.com/user-attachments/assets/b2761bf3-d762-4618-adf7-ffc48551a588)


