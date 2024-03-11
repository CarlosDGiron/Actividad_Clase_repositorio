/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/**
 *
 * @author edrei
 */
public class Cliente extends Persona {

    
    private String nit;

    public Cliente(String nit, String nombres, String apellidos, String direccion, String fechaDeNacimiento, String numeroDeTelefono) {
        super(nombres, apellidos, direccion, fechaDeNacimiento, numeroDeTelefono);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
       
}
