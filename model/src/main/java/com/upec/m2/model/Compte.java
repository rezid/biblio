/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upec.m2.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author UPEC
 */
//TODO : JPA : Transformer la classe en entité. Stratégie de génération de la clé primaire IDENTITY
//TODO : JPA : Le nom de la table doit être "COMPTE"
//TODO : JPA : Mettre la requête nommée suivante (findAllComptes) 
public class Compte implements Serializable {
	//TODO : JPA :  Nom de la colonne de clé primaire "COMPTE_ID"
    private Long id;
    //TODO : BV : Doit être "0 ou POSITIF"
    private int nombreMaxEmprunt;
	//TODO : BV : Doit être "POSITIF"
    private int dureeMaxEmprunt;
    private boolean etat;
	
	//TODO : JPA :  Nom de la table de collection "COMMENTAIRES"
    private List<String> commentaires;
    //TODO : JPA : Rélation unidirectionelle   
    //TODO : JPA : Nom de la colonne de jointure "COL_DE_JOINTURE_ID"
	//TODO : BV : Doivent être validés en même temps que Compte
    private List<CarteDeCredit> carteDeCredit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CarteDeCredit> getCarteDeCredit() {
        return carteDeCredit;
    }

    public void setCarteDeCredit(List<CarteDeCredit> carteDeCredit) {
        this.carteDeCredit = carteDeCredit;
    }

    public int getNombreMaxEmprunt() {
        return nombreMaxEmprunt;
    }

    public void setNombreMaxEmprunt(int nombreMaxEmprunt) {
        this.nombreMaxEmprunt = nombreMaxEmprunt;
    }

    public int getDureeMaxEmprunt() {
        return dureeMaxEmprunt;
    }

    public void setDureeMaxEmprunt(int dureeMaxEmprunt) {
        this.dureeMaxEmprunt = dureeMaxEmprunt;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public List<String> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<String> commentaires) {
        this.commentaires = commentaires;
    }
    
    
    
}
