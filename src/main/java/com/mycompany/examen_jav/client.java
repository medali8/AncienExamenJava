/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_jav;

import java.util.Objects;

/**
 *
 * @author skndr
 */
public class client {
    private String nom ;
    private String prenom ;
    private String adresse ;
    private int nbLit ;
    public client(){
        
    }
    public client(String n , String p , String add , int nbl){
        this.nom = n ;
        this.prenom = p ;
        this.adresse= add;
        this.nbLit=nbl ;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbLit() {
        return nbLit;
    }

    public void setNbLit(int nbLit) {
        this.nbLit = nbLit;
    }
    @Override
    public String toString(){
        return "Nom : "+this.nom + "Prenom :"+this.prenom +"Adresse : "+this.adresse + "nombre de lit :"+this.nbLit;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        client c = (client) obj;
        if (!Objects.equals(this.nom, c.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, c.prenom)) {
            return false;
        }
        return Objects.equals(this.adresse, c.adresse);
    }
    
    
    
}
