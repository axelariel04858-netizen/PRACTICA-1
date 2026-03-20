package PRACTICA_I_AAMU.demo.models;

public class Etiqueta {
    private int id;
    private String nombre;
    private String categoria;
    private String descripcion;
    private String sintaxis;
    private String atributos;
    private String ejemploCodigo;
    private String ejemploReal;

    public Etiqueta() {}

    public Etiqueta(int id, String nombre, String categoria, String descripcion, String sintaxis, String atributos, String ejemploCodigo, String ejemploReal) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.sintaxis = sintaxis;
        this.atributos = atributos;
        this.ejemploCodigo = ejemploCodigo;
        this.ejemploReal = ejemploReal;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getSintaxis() { return sintaxis; }
    public void setSintaxis(String sintaxis) { this.sintaxis = sintaxis; }
    public String getAtributos() { return atributos; }
    public void setAtributos(String atributos) { this.atributos = atributos; }
    public String getEjemploCodigo() { return ejemploCodigo; }
    public void setEjemploCodigo(String ejemploCodigo) { this.ejemploCodigo = ejemploCodigo; }
    public String getEjemploReal() { return ejemploReal; }
    public void setEjemploReal(String ejemploReal) { this.ejemploReal = ejemploReal; }
}