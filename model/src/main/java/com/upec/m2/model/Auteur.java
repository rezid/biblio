/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upec.m2.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author UPEC
 */
@Entity
public class Auteur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //TODO : BV : Doit être "NON VIDE"
    private String nom;
	//TODO : BV : Doit être "NON VIDE"
    private String prenom;
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "AUT_LIV")
	//TODO : JPA : Etabir une rélation *-* (ManyToMany). 
				 //La classe courante (Auteur) doit est  le propriétaire de la rélation
				 //La stratégie de chargement doit être EAGER
	//TODO : JPA : 	La table e jointure de la rélation doit être AUT_LIV
	//TODO : BV : Doit être "NON VIDE" et validé en même temps que Auteur
    private List<Livre> livres;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }
    @PrePersist
    public void prePersist(){
        System.out.println("prePersist");
    }
    @PreUpdate
    public void preUpdate(){
        System.out.println("preUpdate");
    }
    @PostUpdate
    public void postLoad(){
        System.out.println("postLoad");
    } 
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auteur)) {
            return false;
        }
        Auteur other = (Auteur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.upec.m2.library.model.Auteur[ id=" + id + " ]";
    }
    
}
