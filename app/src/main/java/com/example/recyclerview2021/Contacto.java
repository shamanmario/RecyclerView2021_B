package com.example.recyclerview2021;

public class Contacto {

    private int id;
    private int foto;
    private String nombre;
    private String numero;

    public Contacto() {
        id = 0;
        foto = 0;
        nombre = "";
        numero = "";
    }

    public Contacto(int id, int foto, String nombre, String numero) {
        this.id = id;
        this.foto = foto;
        this.nombre = nombre;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "id=" + id +
                ", foto=" + foto +
                ", nombre='" + nombre + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
