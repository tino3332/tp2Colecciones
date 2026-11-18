package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // 3. Insertar varios productos en un HashSet (no permite duplicados basados en equals/hashCode)
        HashSet<Producto> inventario = new HashSet<>();

        // Agregamos productos (incluyendo duplicados lógicos con el mismo código)
        inventario.add(new Producto("P001", "Teclado Mecánico"));
        inventario.add(new Producto("P002", "Mouse Inalámbrico"));
        inventario.add(new Producto("P003", "Monitor 24 pulgadas"));
        inventario.add(new Producto("P001", "Teclado Genérico (Duplicado)")); // Será rechazado por el Set

        System.out.println("==========================================");
        System.out.println("   INVENTARIO DE PRODUCTOS - HASHSET      ");
        System.out.println("==========================================");

        // 4. Recorrer el set e imprimir los productos
        for (Producto producto : inventario) {
            System.out.println(producto); // Llama automáticamente al toString()
        }

        System.out.println("==========================================");
    }
}