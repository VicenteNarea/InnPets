package Modelo;

public class Personas {
        private String nombre;
        private String ruta;

    public Personas(String ruta ,String nombre) {
        this.ruta = ruta;
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
