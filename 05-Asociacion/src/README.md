# Asociación

## Definición
Este paradigma trata sobre representar la relación entre 2 clases independientes en donde un objeto de una clase puede usar a otro sin ser necesariamente su dueño.

## Idea Clave
Lo principal en este paradigma es que representa relaciones entre objetos sin la necesidad que esten relacionados ayudando asi al bajo acoplamiento en el código.

## Clases Ejemplo
Clase: Profesor
Clase independiente que representa a un docente con su nombre. Existe por sí sola sin necesitar un curso.

Clase: Curso
Clase que se asocia a un Profesor recibiéndolo como referencia. Usa sus datos sin crearlo ni destruirlo.

Clase: Main
Arranca el código con el fin de demostrar la finalidad del paradigma.

## Como Ejecutar
1. Abrir terminal en la carpeta que contiene el paquete asociacion
2. Compilar con: javac asociacion/*.java
3. Ejecutar con: java asociacion.Main

## Salida esperada
Curso: POO Java
Profesor: Andrés Gómez

## Aprendizaje
Este paradigma ayuda a creación y relación de clases sin que esten relacionadas una con otra y provando que estas son relaciones que se pueden dar.