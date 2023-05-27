package Unidad6;

import java.util.Objects;

public class Persona {
    private String curp;
    private String nombre;
    private String telefono;
    private Fecha nacimiento;
    private String clave;
    private int horas;

    public Persona(String curp, String nombre, String telefono, Fecha nacimiento) {
        this.curp = curp;
        this.nombre = nombre;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
    }

    public Persona(String curp, String nombre, String telefono) {
        this.curp = curp;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Persona() {

    }

    public Persona(String curp, String nombre, String telefono, Fecha fechaNacimiento, String clave, int horas) {
        super ();
        this.curp = curp;
        this.nombre = nombre;
        this.telefono = telefono;
        this.nacimiento = fechaNacimiento;
        this.clave = clave;
        this.horas = horas;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return getCurp().equals(persona.getCurp()) && getNombre().equals(persona.getNombre()) && getTelefono().equals(persona.getTelefono()) && getNacimiento().equals(persona.getNacimiento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCurp(), getNombre(), getTelefono(), getNacimiento());
    }

    @Override
    public String toString() {
        return
                " \ncurp: " + curp +
                " \nnombre: " + nombre +
                " \ntelefono: " + telefono +
                " \nnacimiento: " + nacimiento;
    }
}
