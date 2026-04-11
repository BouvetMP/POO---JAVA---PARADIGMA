# Herencia 

## Definición
Este paradigma trata sobre la reutilización de código en donde las clases hijas heredan de una clase padre ya sean métodos o atributos y de esa forma ampliar su comportamiento a la vez que evita la duplicación de código. 

## Idea Clave
Ayuda a crear códigos que no repitan lineas de código en clases similares.

## Clases Ejemplo
Clase: Empleado (Padre)
Define los atributos y comportamiento común a todo empleado: nombre, salario y mostrarInfo().

Clase: Gerente
Extiende Empleado agregando el atributo area y el método mostrarArea().

Clase: Desarrollador
Extiende Empleado agregando el atributo lenguaje y el método mostrarLenguaje().

Clase: Main
Es el punto de arraque del programa con el fin de demostrar el paradigma.

## Como Ejecutar
1. Abrir terminal en la carpeta que contiene el paquete herencia
2. Compilar con: javac herencia/*.java
3. Ejecutar con: java herencia.Main

## Salida esperada
Nombre: Maria
Salario: 4500000.0
Área: Tecnologia
------
Nombre: Carlos
Salario: 3800000.0
Lenguaje principal: Java

## Aprendizaje
Que este paradigma ayuda mucho al momento de definir detalles especificos de una clase donde las clases hijas dan detalles especificos heredando el resto de la clase padre.