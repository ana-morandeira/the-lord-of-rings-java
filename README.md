# Personajes de "El Señor de los Anillos" - Práctica de POO en Java

Este proyecto es una implementación en Java que pone en práctica los conceptos fundamentales de la **Programación Orientada a Objetos (POO)**: Encapsulamiento, Herencia y Polimorfismo, aplicados al universo de El Señor de los Anillos.

## 🚀 Conceptos Aplicados

* **Superclase (`Character`):** Contiene los atributos comunes a todas las razas (nombre, edad, salud, arma).
* **Herencia:** Se han creado 5 clases que heredan de la superclase: `Elf`, `Dwarf`, `Human`, `Hobbit` y `Orc`.
* **Encapsulamiento:** Todos los atributos son privados (`private`) y se acceden mediante métodos públicos `getters` y `setters`.
* **Polimorfismo:** Se utiliza el método `showDetails()` para imprimir la información específica de cada raza de forma dinámica desde una lista genérica.

## 🛠️ Estructura del Proyecto

El proyecto está organizado en el paquete `org.example` con la siguiente jerarquía de archivos:

* `Character.java`: Superclase base.
* `Elf.java`, `Dwarf.java`, `Human.java`, `Hobbit.java`, `Orc.java`: Subclases específicas por raza.
* `Main.java`: Clase principal que inicializa 15 personajes (3 por raza) y ejecuta la impresión por consola.

## 📊 Diagrama de Clases

A continuación se muestra el diseño de la jerarquía de clases realizado en Draw.io:

<img width="750" height="742" alt="Diagrama-TheLordOfRings" src="https://github.com/user-attachments/assets/3d11bdbc-e352-4d0a-a8f3-d0ea95bfa66c" />



## 📋 Requisitos de la Tarea

- [x] 5 razas diferentes con 3 personajes cada una.
- [x] Atributos privados con Setters y Getters.
- [x] Uso de Herencia y Superclase.
- [x] Polimorfismo para la impresión de detalles.
- [x] Código y nombres de clases en Inglés / Datos impresos en Español.

## 💻 Ejecución

1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA (o cualquier IDE de Java).
3. Ejecutar la clase `Main.java`.
4. Los resultados se mostrarán en la terminal del sistema.

## ✒️ Autor

  Ana Morandeira
