/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upec.m2.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author UPEC
 */
//@Entity
@Table(name = "LIVRE")
//TODO : JPA : Ecrire une requête nommée "countLivres" qui retourne le nombre de livre en base 
public class Livre extends Ouvrage {


   //TODO : BV : Doit être "UN NOMBRE POSITIF"
   private int nombreDePages;
   
   @ManyToMany(mappedBy = "livres", cascade = CascadeType.ALL)
   //TODO : BV : Doit être "NON VIDE" et validé en même temps que Ouvrage
   private List<Auteur> auteurs;
   
    public int getNombreDePages() {
        return nombreDePages;
    }

    public void setNombreDePages(int nombreDePages) {
        this.nombreDePages = nombreDePages;
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(List<Auteur> auteurs) {
        this.auteurs = auteurs;
    }


    @Override
    public String toString() {
        return "com.upec.m2.library.model.Livre[ id=" + this.getId() + " ]";
    }
    
}
