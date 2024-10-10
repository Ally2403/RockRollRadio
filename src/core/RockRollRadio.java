/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.persona.Artista;
import core.persona.Invitado;
import core.persona.Locutor;
import java.util.ArrayList;

/**
 *
 * @author Allison Ruiz
 */
public class RockRollRadio {
    private ArrayList<Artista> artistas;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private ArrayList<Locutor> locutores;
    private ArrayList<Programa> programas;

    public RockRollRadio() {
        this.artistas = new ArrayList<>();
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.locutores = new ArrayList<>();
        this.programas = new ArrayList<>();
    }
    
    public Programa getProgramaConMasCancionesDeArtista(Artista artista){
        ArrayList<Integer> counts = new ArrayList<>();
        for(Programa programa : this.programas){
            counts.add(0);
        }
        int index = -1;
        for(Programa programa : this.programas){
            index++;
            for(Emision emision : programa.getEmisiones()){
                for(Cancion cancion : emision.getCanciones()){
                    if(cancion.getArtista() == artista){
                        counts.set(index,counts.get(index) + 1);
                    }
                }
            }
        }
        int max = 0;
        for(int i = 0; i<counts.size(); i++){
            if(counts.get(i) > max){
                max = counts.get(i);
            }
        }
        int index1 = counts.indexOf(max);
        return this.programas.get(index1);
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }
    
    public Cancion getCancion(int index){
        return this.canciones.get(index);
    }
    
    public Artista getArtista(int index){
        return this.artistas.get(index);
    }
    
    public Programa getPrograma(int index){
        return this.programas.get(index);
    }
    
    public Locutor getLocutor(int index){
        return this.locutores.get(index);
    }
    
    public void addPrograma(Programa programa){
        if(!this.programas.contains(programa)){
            this.programas.add(programa);
        }
    }
    
    public void addArtista(Artista artista){
        if(!this.artistas.contains(artista)){
            this.artistas.add(artista);
        }
    }
    
    public void addCancion(Cancion cancion){
        if(!this.canciones.contains(cancion)){
            this.canciones.add(cancion);
        }
    }
    
    public void addLocutor(Locutor locutor){
        if(!this.locutores.contains(locutor)){
            this.locutores.add(locutor);
        }
    }
    
    public boolean addEmision(Emision emision){
        return true;
    }
    
    public void addInvitado(Invitado invitado, Emision emision){
        if(!this.invitados.contains(invitado)){
            this.invitados.add(invitado);
        }
        invitado.addEmision(emision);
        emision.addInvitado(invitado);
    }
}
