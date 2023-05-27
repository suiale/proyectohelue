package Unidad6;

public class ProfesorTiempoCompleto extends Profesor {
    private double salario;
    private String departamento;
    private int antiguedad;
    private int horas;

    public ProfesorTiempoCompleto(String nombre, String telefono, double salario, String departamento, int antiguedad) {
        super(nombre, telefono);
        this.salario = salario;
        this.departamento = departamento;
        this.antiguedad = antiguedad;
    }

    public  ProfesorTiempoCompleto(String curp, String nombre, String telefono, Fecha nacimiento, String clave) {
        super(curp, nombre, telefono, nacimiento, clave);
        this.getCurp();
        this.getNombre();
        this.getTelefono();
        this.getNacimiento();
        this.getClave();

    }

    public ProfesorTiempoCompleto(String curp, String nombre, String telefono, Fecha fechaNacimiento, String clave, int horas) {
        super(curp, nombre, telefono, fechaNacimiento, clave, horas);
        this.getCurp();
        this.getNombre();
        this.getTelefono();
        this.getNacimiento();
        this.getClave();
        this.getHoras();

    }

    @Override
    public void calcularSalario() {
    }
    public int getHoras() {
        return horas;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

}

