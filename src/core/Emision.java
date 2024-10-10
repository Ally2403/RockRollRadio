/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.persona.Invitado;
import java.util.ArrayList;

/**
 *
 * @author Allison Ruiz
 */
public class Emision {
    private int serial;
    private static int serialCount = 0;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private Programa programa;

    public Emision(Programa programa) {
        this.serial = Emision.serialCount;
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.programa = programa;
        
        Emision.serialCount++;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    
    public void addCancion(Cancion cancion){
        if(!this.canciones.contains(cancion)){
            this.canciones.add(cancion);
        }
    }
    
    public void addInvitado(Invitado invitado){
        if(!this.invitados.contains(invitado)){
            this.invitados.add(invitado);
        }
    }

    public Programa getPrograma() {
        return programa;
    }
    
}
