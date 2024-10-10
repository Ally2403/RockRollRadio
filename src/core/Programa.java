/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.persona.Locutor;
import java.util.ArrayList;

/**
 *
 * @author Allison Ruiz
 */
public class Programa {
    private String nombre;
    private static int serialCount = 0;
    private int serial;
    private ArrayList<Emision> emisiones;
    private Locutor locutor;

    public Programa(String nombre, Locutor locutor) {
        this.nombre = nombre;
        this.serial = Programa.serialCount;
        this.emisiones = new ArrayList<>();
        this.locutor = locutor;
        
        Programa.serialCount++;
        this.locutor.addPrograma(this);
    }

    public ArrayList<Emision> getEmisiones() {
        return emisiones;
    }
    
    public Emision getLastEmision(){
        return this.emisiones.get(emisiones.size() - 1);
    }

    public String getNombre() {
        return nombre;
    }
    
}
