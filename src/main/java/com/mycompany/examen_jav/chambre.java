/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_jav;

/**
 *
 * @author skndr
 */
public class chambre {
    private int numChbr ;
    private int nbLitDisp ;
    private String etat ;
    public chambre(){
        
    }
    public chambre (int n , int nbl , String e){
        this.numChbr= n ;
        this.nbLitDisp = nbl ;
        if (e.equals("reserve") || e.equals("libre")){
            this.etat = e ;
        }
    }

    public int getNumChbr() {
        return numChbr;
    }

    public void setNumChbr(int numChbr) {
        this.numChbr = numChbr;
    }

    public int getNbLitDisp() {
        return nbLitDisp;
    }

    public void setNbLitDisp(int nbLitDisp) {
        
        this.nbLitDisp = nbLitDisp;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        if (etat.equals("reserve") ||etat.equals("libre"))
        this.etat = etat;
    }
    @Override
    public String toString(){
        return "num chambre :"+this.numChbr+" le nombre de lit dispo : "+this.nbLitDisp + "avec etat : "+this.etat ;
    }
}
