/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_andreflores_gerardohasbum;

import java.util.ArrayList;

/**
 *
 * @author ghasb
 */
public class Usuarios extends Personas{
    
    private String correo, usuario, password;
    private double dinero;
    public ArrayList<Agentes> agentes = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String correo, String usuario, String password, double dinero, String nombre, int edad) {
        super(nombre, edad);
        this.correo = correo;
        this.usuario = usuario;
        this.password = password;
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return usuario + ": \nCorreo: " + correo + "\nUsuario: " + usuario + "\nPassword: " + password + "\nDinero: " + dinero + "\nAgentes: " + agentes;
    }
}
