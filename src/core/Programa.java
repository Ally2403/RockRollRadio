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
    private ArrayList<Locutor> locutores;

    public Programa(String nombre, Locutor locutor) {
        this.nombre = nombre;
        this.serial = Programa.serialCount;
        this.emisiones = new ArrayList<>();
        this.locutores = new ArrayList<>();
        
        Programa.serialCount++;
        this.locutores.add(locutor);
        this.locutores.get(0).addPrograma(this);
    }
    
    public void addEmision(Emision emision){
        if(!this.emisiones.contains(emision)){
            this.emisiones.add(emision);
        }
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
