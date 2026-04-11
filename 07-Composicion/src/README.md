# Composición

## Definición
Este paradigma es la versión contraria a la Agregación en donde un objeto es responsable de la creación y existencia de otros objetos que este contiene.

## Idea Clave
Lo principal en este paradigma es que ayuda a mantener el control y la alta cohesión de los objetos asignando una clase que se encarga de supervisar su creación y destrucción.

## Clases Ejemplo
Clase: Habitación
Clase que representa una parte constitutiva de la casa. No se instancia desde afuera ni existe de forma independiente, siempre es creada por Casa.

Clase: Casa
Clase contenedora que crea internamente cada Habitacion a través de agregarHabitacion(). Es dueña absoluta del ciclo de vida de sus partes.

Clase: Main
Arranca el código con el fin de demostrar la finalidad del paradigma.

## Como Ejecutar
1. Abrir terminal en la carpeta que contiene el paquete composicion
2. Compilar con: javac composicion/*.java
3. Ejecutar con: java composicion.Main

## Salida esperada
Casa Ubicada en: Calle 10# 15-20
- Sala
- Cocina
- Habitación Principal

## Aprendizaje
Este paradigma ayuda presentar la diferencia entre un la Composición y Agregación en la cual se pueden ver las diferencias entre las relaciones que manejan ambos paradigmas.