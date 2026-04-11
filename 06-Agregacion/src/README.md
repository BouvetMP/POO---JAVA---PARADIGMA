# Agregación

## Definición
Este paradigma es como una versión más grande de asociación en donde un objeto contiene a otro sin la necesidad de que este sea responsable de la creación de las mismas siendo una conexión Todo-Parte.

## Idea Clave
Lo principal en este paradigma es la reutilización de objetos en donde un objeto existia antes de estar en otro y seguira estando aun si ese otro objeto desaparece conservando su identidad propia.

## Clases Ejemplo
Clase: Jugador
Clase independiente que representa a un deportista con su nombre. Existe por sí sola sin necesitar un equipo.

Clase: Equipos
Clase contenedora que agrupa una lista de objetos Jugador. Los recibe desde afuera y los administra, pero no los crea ni los destruye.

Clase: Main
Arranca el código con el fin de demostrar la finalidad del paradigma.

## Como Ejecutar
1. Abrir terminal en la carpeta que contiene el paquete agregacion
2. Compilar con: javac agregacion/*.java
3. Ejecutar con: java agregacion.Main

## Salida esperada
Equipo: Tigres
- Luis
- Pedro

## Aprendizaje
Este paradigma ayuda presentar la diferencia entre un la Asociación y Agregación, y permite entender como es que un objeto puede agrupar a otros sin influir en ellos como una Asociación agrupada.