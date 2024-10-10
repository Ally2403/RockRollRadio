/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.Cancion;
import java.util.ArrayList;

/**
 *
 * @author Allison Ruiz
 */
public class Artista extends Persona{
    private ArrayList<Cancion> canciones;

    public Artista(String nombre) {
        super(nombre);
        this.canciones = new ArrayList<>();
    }
    
    public void addCancion(Cancion cancion){
        if(!this.canciones.contains(cancion)){
            this.canciones.add(cancion);
        }
    }

    public String getNombre() {
        return nombre;
    }
    
}
