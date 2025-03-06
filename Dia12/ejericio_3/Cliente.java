
package ejericio_3;

public class Cliente {
    public String nombres;
    public Localidad localidad;
    public float saldo;

    public Cliente(String nombres, Localidad localidad, float saldo) {
        this.nombres = nombres;
        this.localidad = localidad;
        this.saldo = saldo;
    }

    public String getNombres() {
        return nombres;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
