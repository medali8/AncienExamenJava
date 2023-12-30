/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_jav;

/**
 *
 * @author skndr
 */
public class ChambreException extends Exception{
    private chambre c;
    public ChambreException(String msjerreur , chambre c){
        super(msjerreur);
        this.c=c;
    }
    public chambre getChambre(){
        return this.c;
    }
    
    
}
