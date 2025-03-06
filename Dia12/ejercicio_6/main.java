
package ejercicio_6;

public class main{
    public String nombre;
    public String contacto;
    public String CuentaBancaria;

    public main(String nombre, String contacto, String CuentaBancaria) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.CuentaBancaria = CuentaBancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setCuentaBancaria(String CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }
}

