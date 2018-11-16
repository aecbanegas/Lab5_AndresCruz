
package lab5_andrescruz;

import java.util.Date;

public class Empresa {
    String Nombre;
    double capital;
    Date fundacion;
    String ubicacion;
    String id_sucursal;
    String pin;
// cuentan con un nombre(único), capital financiero (dependerá de su tipo), fecha de fundación, 
//         y ubicación de la sucursal, id sucursal (Es único y debe ser un entero), PIN de acceso.   

    public Empresa(String Nombre, double capital, Date fundacion, String ubicacion, String id_sucursal, String pin) {
        this.Nombre = Nombre;
        this.capital = capital;
        this.fundacion = fundacion;
        this.ubicacion = ubicacion;
        this.id_sucursal = id_sucursal;
        this.pin = pin;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public Date getFundacion() {
        return fundacion;
    }

    public void setFundacion(Date fundacion) {
        this.fundacion = fundacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(String id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "ID "+id_sucursal;
    }
    
}
