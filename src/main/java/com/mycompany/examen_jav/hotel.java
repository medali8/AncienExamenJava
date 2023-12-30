/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_jav;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author skndr
 */
public class hotel {
    private final Set<client> lclients ;
    private final List<chambre> lchambre ;
    private final Map<client,chambre> lres ;
   
    public hotel(){
        this.lclients=new HashSet<client>();
        this.lchambre = new ArrayList<chambre>();
        this.lres = new HashMap<client,chambre>();
    }
    public boolean existeClient(client cl){
        return this.lclients.contains(cl);
    }
    
    public boolean existeChambre(int numChambre){
        
        Iterator<chambre> it = lchambre.iterator();
        while (it.hasNext()){
            if (it.next().getNumChbr()==numChambre){
                return true ;
            }
        }
        return false; 

    }
    public boolean verifDispo(chambre ch , int nblit){
        if (this.existeChambre(ch.getNumChbr()) && ch.getNbLitDisp()>=nblit && ch.getEtat().equals("libre")){
            return true ;
        }
        return false ;
       
    }
    public boolean reserver(client cl , chambre ch) throws ChambreException{
        if (lres.containsValue(ch)==true){
            throw new ChambreException("Chambre"+ch.getNumChbr()+" deja Reservée",ch) ;
        } else if (lres.containsKey(cl)==false && existeChambre(ch.getNumChbr())){
                    if (ch.getNbLitDisp()==0){
                        throw new ChambreException("chambre"+ ch.getNumChbr()+" n'a pas de lit dispo", ch);
                    }
                    else if(ch.getEtat().equals("libre")){
                    ch.setEtat("reserve");
                    lres.put(cl, ch);
                    return true ;
                    }
                    
                }
                    return false ;

        }
    
    public boolean annulerReservation(client cl) throws NullPointerException{
        if (cl==null){
            throw new NullPointerException(toString());
        } else if(lres.containsKey(cl)==false){
            return false ;
        }          
        else if (lres.containsKey(cl)==true) {
            chambre c = lres.get(cl);
            for (chambre ch : lchambre){
                if(c.equals(ch)){
                    ch.setEtat("libre");
                }
            }
            lres.remove(cl);
            return true ;
    }
        return false ;
    }
    
    public boolean transferChambre(client cl , chambre c1 , chambre c2) throws NullPointerException,ChambreException{
        if (cl==null){
            throw new NullPointerException(toString());
        } else if (lres.containsKey(cl)==false){
            return false ;
        }
        else if (lres.containsValue(c2)==true){
            throw new ChambreException("Chambre"+c2.getNumChbr()+" deja Reservée",c2) ;
        }
        else {
           if (existeChambre(c2.getNumChbr()))
                    if (c2.getNbLitDisp()==0){
                        throw new ChambreException("chambre"+ c2.getNumChbr()+" n'a pas de lit dispo", c2);
                    }
                    else {
                        lres.get(cl).setEtat("reserve");
                        lres.get(cl).setNumChbr(lres.get(c1).getNumChbr());
                        lres.get(cl).setNumChbr(lres.get(c1).getNbLitDisp());
                        c1.setEtat("libre");
                        return true ;
                    }
                }
                
            return false ;
        }
        
    
    public void afficheTous(){
        for (Map.Entry<client,chambre> en : lres.entrySet()){
            System.out.println(en.toString());
        }
    }
    
    
    
    
    
}
    
