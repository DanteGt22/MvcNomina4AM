
package mvcnomina4am;

public class modelo {
    String nombre, cedula;
    double salario, prestamos, auxilio_transporte, sueldo;
    int dias, hed, hen, hef;

    public modelo() {
    }

    public modelo(String nombre, String cedula, double salario, double prestamos, double auxilio_transporte, double sueldo, int dias, int hed, int hen, int hef) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
        this.prestamos = prestamos;
        this.auxilio_transporte = auxilio_transporte;
        this.sueldo = sueldo;
        this.dias = dias;
        this.hed = hed;
        this.hen = hen;
        this.hef = hef;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(double prestamos) {
        this.prestamos = prestamos;
    }

    public double getAuxilio_transporte() {
        return auxilio_transporte;
    }

    public void setAuxilio_transporte(double auxilio_transporte) {
        this.auxilio_transporte = auxilio_transporte;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getHed() {
        return hed;
    }

    public void setHed(int hed) {
        this.hed = hed;
    }

    public int getHen() {
        return hen;
    }

    public void setHen(int hen) {
        this.hen = hen;
    }

    public int getHef() {
        return hef;
    }

    public void setHef(int hef) {
        this.hef = hef;
    }

    @Override
    public String toString() {
        return "modelo{" + "nombre=" + nombre + ", cedula=" + cedula + ", salario=" + salario + ", prestamos=" + prestamos + ", auxilio_transporte=" + auxilio_transporte + ", sueldo=" + sueldo + ", dias=" + dias + ", hed=" + hed + ", hen=" + hen + ", hef=" + hef + '}';
    }
    
}
