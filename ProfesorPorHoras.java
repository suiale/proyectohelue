package Unidad6;

import Unidad6.Fecha;
import Unidad6.Profesor;

import java.util.Objects;

public class ProfesorPorHoras {
    private String curp;
    private String nombre;
    private String telefono;
    private Fecha nacimiento;
    private String clave;

    public ProfesorPorHoras(String curp, String nombre, String telefono, Fecha nacimiento, String clave) {
        this.curp = curp;
        this.nombre = nombre;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.clave = clave;
    }

    // Getters y setters

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    // Otros métodos de la clase
}


