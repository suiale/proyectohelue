package Unidad6;

import java.util.Objects;

public class Profesor extends Persona {
    private String clave;
    protected double salario;

    public Profesor(String curp, String nombre, String telefono, Fecha nacimiento, String clave) {
        super(curp, nombre, telefono, nacimiento);
        this.clave = clave;
        calcularSalario();
    }

    public Profesor(String curp, String nombre, String telefono, String clave) {
        super(curp, nombre, telefono);
        this.clave = clave;
        calcularSalario();
    }

    public Profesor(String curp, String nombre, String telefono, Fecha fechaNacimiento, String clave, int horas) {
        super(curp, nombre, telefono, fechaNacimiento, clave, horas);
        this.clave = clave;
        calcularSalario();
    }

    // calculate salary
    public void calcularSalario() {
        salario = 0;
    }

    public Profesor() {
        super();
    }

    public Profesor(String nombre, String telefono) {
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }


    public double getSalario() {
        return salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Profesor that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.getSalario(), getSalario()) == 0 && getClave().equals(that.getClave());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getClave(), getSalario());
    }

    @Override
    public String toString() {
        return "Profesor: " + "\n" +
                super.toString() +
                "\nclave: " + clave +
                "\nsalario: " + salario;
    }
}
