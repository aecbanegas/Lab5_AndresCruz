
package lab5_andrescruz;

import java.util.Date;

public class Empleado {
    String nombre;
    Date nacimiento;
    String correo;
    String cargo;
    double salario;
//    Nombre completo, Fecha de nacimiento, correo electrónico, Cargo y su salario mensual (el cual depende de su Tipo).

    public Empleado(String nombre, Date nacimiento, String correo, String cargo, double salario) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
