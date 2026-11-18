package org.example;

import java.util.Objects;

public class Producto {
    private String codigo;
    private String descripcion;

    // Constructor
    public Producto(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // equals() basado en el código
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo);
    }

    // hashCode() basado en el código
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    // toString() para mostrar los datos de forma legible
    @Override
    public String toString() {
        return "Producto [Código: " + codigo + ", Descripción: " + descripcion + "]";
    }
}