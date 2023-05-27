package Unidad6;

import java.util.Objects;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha(String dato) {
        String[] datos = dato.split("/");
        this.dia = Integer.parseInt(datos[0]);
        this.mes = Integer.parseInt(datos[1]);
        this.anio = Integer.parseInt(datos[2]);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Clases.Fecha: " +
                " \ndia: " + dia +
                " \nmes: " + mes  +
                " \nanio: " + anio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fecha fecha)) return false;
        return getDia() == fecha.getDia() && getMes() == fecha.getMes() && getAnio() == fecha.getAnio();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDia(), getMes(), getAnio());
    }
}
